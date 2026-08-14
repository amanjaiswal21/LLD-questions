package com.SystemDesign.LLD.questions.Notification;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

public class Notification {
    UUID uuid;
    String userId;
    NotificationChannel channel;
    NotificationPriority priority;
    Map<String, String> params;
    String status;
    LocalDateTime createdAt;
    LocalDateTime sentAt;
}
