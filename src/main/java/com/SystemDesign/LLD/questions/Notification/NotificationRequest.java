package com.SystemDesign.LLD.questions.Notification;

import java.util.Map;

public class NotificationRequest {
    String userId;
    NotificationChannel channel;
    NotificationPriority priority;
    Map<String, String> params;
}
