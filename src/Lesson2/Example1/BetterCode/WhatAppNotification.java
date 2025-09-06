package Lesson2.Example1.BetterCode;

public class WhatAppNotification  implements  Notification{
    @Override
    public void send() {
        System.out.println("sending the WhatApps Notification");
    }
}
