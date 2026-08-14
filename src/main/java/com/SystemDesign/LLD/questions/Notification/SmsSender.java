package com.SystemDesign.LLD.questions.Notification;

public class SmsSender implements NotificationSender{
    @Override
    public void sendNotification(Notification notification) {
        System.out.println("Sending sms via sms to "+ notification.userId);
    }

    @Override
    public NotificationChannel getChannel() {
        return NotificationChannel.SMS;
    }
}
