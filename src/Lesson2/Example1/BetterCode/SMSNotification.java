package Lesson2.Example1.BetterCode;

public class SMSNotification  implements  Notification{

    @Override
    public void send() {
        System.out.println("sending the sms notification");
    }
}
