package com.SystemDesign.LLD.questions.RateLimitter;

import com.SystemDesign.LLD.questions.RateLimitter.RateLimiterStrategy.RateLimiterStrategy;
import com.SystemDesign.LLD.questions.RateLimitter.RateLimiterStrategy.TokenBucketStrategy;
import com.SystemDesign.LLD.questions.RateLimitter.config.TokenBucketConfig;

import java.time.Duration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RateLimiterDemo {
    public static void main(String[] args) throws InterruptedException {
        TokenBucketConfig config = new TokenBucketConfig(5, 1, Duration.ofSeconds(15));
        Map<String, TokenBucket> buckets = new ConcurrentHashMap<>();

        RateLimiterStrategy rateLimiterStrategy = new TokenBucketStrategy(config, buckets);
        RateLimitter rateLimitter = new RateLimitter(rateLimiterStrategy);

        for (int i = 1; i < 30; i++) {
            boolean ans = rateLimitter.isAllowed("user1");
            System.out.println(i + "  is Allowed " + ans);
            Thread.sleep(1000);
        }
    }
}
