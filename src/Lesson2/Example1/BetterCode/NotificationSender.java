package Lesson2.Example1.BetterCode;

import Lesson2.Example1.ProblamaticCode.NotificationType;

import java.util.List;

public class NotificationSender {
    public  void sendNotifications(List<Notification> notifications){
        for(Notification notification:notifications){
            notification.send();
        }

    }
}
