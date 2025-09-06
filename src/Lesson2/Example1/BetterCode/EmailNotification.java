package Lesson2.Example1.BetterCode;

public class EmailNotification implements  Notification{
    @Override
    public void send() {
        System.out.println("Sending the Email Notification");

    }
}
