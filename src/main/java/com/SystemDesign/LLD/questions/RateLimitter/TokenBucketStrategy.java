package com.SystemDesign.LLD.questions.RateLimitter;

import org.jspecify.annotations.NonNull;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.Objects;

public class TokenBucketStrategy implements RateLimiterStrategy {
    private final TokenBucketConfig tokenBucketConfig;
    private final Map<String,TokenBucket>buckets;

    public TokenBucketStrategy(TokenBucketConfig tokenBucketConfig, Map<String,TokenBucket>bucket) {
        this.tokenBucketConfig = tokenBucketConfig;
        this.buckets = bucket;
    }

    @Override
    public boolean isAllowed(String key) {
        Instant now=Instant.now();

        TokenBucket bucket=buckets.get(key);
        if(Objects.isNull(bucket)){
          bucket=new TokenBucket(tokenBucketConfig.capacity(),now);
         buckets.put(key,bucket);
        }
        else{
            bucket = refillBucket(bucket, now);
        }
        return ConsumeToken(key, bucket);
    }

    private boolean ConsumeToken(String key, TokenBucket bucket) {
        if(bucket.availableToken()<=0){
            return false;
        }
        else{
            bucket =new TokenBucket(bucket.availableToken()-1, bucket.lastFilledAt());
            buckets.put(key, bucket);
            return true;
        }
    }

    private TokenBucket refillBucket(TokenBucket bucket, Instant now) {
        Duration timeElapsed=Duration.between(bucket.lastFilledAt(), now);
        int totalInterval=(int)(timeElapsed.toMillis()/tokenBucketConfig.refillTime().toMillis());
        int tokenToAdd=(int)(totalInterval* tokenBucketConfig.tokensToAdd());
        int availableToken=Math.min(tokenBucketConfig.capacity(), bucket.availableToken()+tokenToAdd);

        long totalTimeToAddToken=totalInterval*tokenBucketConfig.refillTime().toMillis();

        bucket = new TokenBucket(availableToken, bucket.lastFilledAt().plusMillis(totalTimeToAddToken));
        return bucket;
    }
}
