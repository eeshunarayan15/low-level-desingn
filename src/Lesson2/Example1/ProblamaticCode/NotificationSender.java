package Lesson2.Example1.ProblamaticCode;

import java.util.List;

import static Lesson2.Example1.ProblamaticCode.NotificationType.sendSMSNotification;

public class NotificationSender {
    public  void sendNotifications(List<NotificationType> notificationTypes){
for(NotificationType notificationType :notificationTypes){
    if(notificationType==NotificationType.SMS){
        NotificationType.sendSMSNotification();
    } else if (notificationType==NotificationType.EMAIL) {
        NotificationType.sendEmailNotification();
    } else if (notificationType==NotificationType.WHATSAPP) {
        NotificationType.sendWhatsappNotification();

    }
}
    }
}
