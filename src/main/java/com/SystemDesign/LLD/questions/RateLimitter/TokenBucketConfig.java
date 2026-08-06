package com.SystemDesign.LLD.questions.RateLimitter;

import java.time.Duration;

public record TokenBucketConfig(int capacity, int tokensToAdd, Duration refillTime) {
}
