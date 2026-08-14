package com.SystemDesign.LLD.questions.RateLimitter.config;

import java.time.Duration;

public record FixedWindowConfig(int maxRequest, Duration windowSize) {
}
