package com.SystemDesign.LLD.questions.Notification;

public class EmailSender implements  NotificationSender{
    @Override
    public void sendNotification(Notification notification) {
        System.out.println("Sending sms via email to "+ notification.userId);
    }

    @Override
    public NotificationChannel getChannel() {
        return NotificationChannel.EMAIL;
    }
}
