package com.SystemDesign.LLD.questions.Notification;

public interface NotificationSender {
    void sendNotification(Notification notification);
    NotificationChannel getChannel();
}
