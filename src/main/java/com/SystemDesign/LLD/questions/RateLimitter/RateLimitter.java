package com.SystemDesign.LLD.questions.RateLimitter;

import com.SystemDesign.LLD.questions.RateLimitter.RateLimiterStrategy.RateLimiterStrategy;

public class RateLimitter {

    private final RateLimiterStrategy rateLimiterStrategy;

    public RateLimitter(RateLimiterStrategy rateLimiterStrategy) {
        this.rateLimiterStrategy = rateLimiterStrategy;
    }

    public boolean isAllowed(String key) {
        return rateLimiterStrategy.isAllowed(key);
    }
}
