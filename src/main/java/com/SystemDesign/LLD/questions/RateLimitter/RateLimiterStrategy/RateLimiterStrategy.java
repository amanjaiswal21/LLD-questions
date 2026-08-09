package com.SystemDesign.LLD.questions.RateLimitter.RateLimiterStrategy;

public interface RateLimiterStrategy {
     boolean isAllowed(String key);
}
