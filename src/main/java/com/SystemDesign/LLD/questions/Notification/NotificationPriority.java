package com.SystemDesign.LLD.questions.Notification;

public enum NotificationPriority {
    LOW(1),
    MEDIUM(5),
    HIGH(10);

    final int level;

    NotificationPriority(int level) {
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }
}
