package com.SystemDesign.LLD.questions.Notification;

public class NotificationService {
    private NotificationSenderFactory notificationSenderFactory;
    private NotificationQueue notificationQueue;

    public NotificationService(NotificationSenderFactory notificationSenderFactory, NotificationQueue notificationQueue) {
        this.notificationSenderFactory = notificationSenderFactory;
        this.notificationQueue=notificationQueue;
    }

    public void sendNotification(NotificationRequest request) throws InterruptedException {
        if (request.channel == null || request.userId == null)
            throw new IllegalArgumentException("Invalid notification request");

        Notification notification = createNotification(request);
        System.out.println("Notification is created" + notification.uuid);
        System.out.println("Notification saved to db");
        notificationQueue.push(notification);

        System.out.println("Notifiaction sent");
    }

    private static Notification createNotification(NotificationRequest request) {
        Notification notification = new Notification();
        notification.channel = request.channel;
        notification.userId = request.userId;
        notification.params = request.params;
        notification.priority = request.priority;
        return notification;
    }
}
