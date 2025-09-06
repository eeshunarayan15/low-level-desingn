package Lesson2.Example1.BetterCode;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Notification> notifications = Arrays.asList(
                new SMSNotification(),
                new EmailNotification(),
                new WhatAppNotification()
        );
        NotificationSender sender = new NotificationSender();
        sender.sendNotifications(notifications);
    }

}
