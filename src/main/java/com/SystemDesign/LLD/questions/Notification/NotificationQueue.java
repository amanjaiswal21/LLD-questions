package com.SystemDesign.LLD.questions.Notification;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class NotificationQueue {
    private BlockingQueue<Notification>queue;

    public NotificationQueue(int size){
        this.queue=new LinkedBlockingQueue<>(size);
    }

    public void push(Notification notification) throws InterruptedException {
        queue.put(notification);
    }

    public Notification poll() throws InterruptedException {
        return queue.take();
    }


}
