package com.SystemDesign.LLD.questions.Notification;

public class NotificationWorker implements Runnable{
    private NotificationQueue notificationQueue;
    public NotificationSenderFactory notificationSenderFactory;

    public NotificationWorker(NotificationQueue notificationQueue, NotificationSenderFactory notificationSenderFactory){
        this.notificationQueue=notificationQueue;
        this.notificationSenderFactory=notificationSenderFactory;
    }

    @Override
    public void run() {
        while(true){
            try {
                Notification notification=notificationQueue.poll();
                NotificationChannel channel=notification.channel;
                NotificationSender notificationSender=notificationSenderFactory.getSender(channel);
                notificationSender.sendNotification(notification);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
