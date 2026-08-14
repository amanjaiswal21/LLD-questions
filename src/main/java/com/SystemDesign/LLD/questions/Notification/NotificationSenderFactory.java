package com.SystemDesign.LLD.questions.Notification;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class NotificationSenderFactory {
    private Map<NotificationChannel, NotificationSender> senderMap;

    public NotificationSenderFactory(List<NotificationSender> senders) {
        this.senderMap = new ConcurrentHashMap<>();

        for (NotificationSender sender : senders) {
            senderMap.put(sender.getChannel(), sender);
        }
    }

    public NotificationSender getSender(NotificationChannel notificationChannel){
        return senderMap.get(notificationChannel);
    }
}
