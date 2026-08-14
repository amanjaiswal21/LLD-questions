package com.SystemDesign.LLD.questions.RateLimitter.config;

import java.time.Duration;

public record TokenBucketConfig(int capacity, int tokensToAdd, Duration refillTime) {
}
