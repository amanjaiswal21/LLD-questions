package com.SystemDesign.LLD.questions.RateLimitter;

import java.time.Instant;

public record TokenBucket(int availableToken, Instant lastFilledAt) {
}
