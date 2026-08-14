package com.SystemDesign.LLD.questions.RateLimitter;

import java.time.Instant;

public record FixedWindow(int noOfRequest, Instant windowStartTime) {
}
