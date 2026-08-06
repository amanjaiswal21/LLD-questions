package com.SystemDesign.LLD.questions.RateLimitter;

public interface RateLimiterStrategy {
    public boolean isAllowed(String key);
}
