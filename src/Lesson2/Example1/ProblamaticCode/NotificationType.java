package Lesson2.Example1.ProblamaticCode;

public enum NotificationType {
    SMS,
    EMAIL,
    WHATSAPP;
    public static void sendEmailNotification(){
        System.out.println("Sending Email Notification");

    }
    public static void sendSMSNotification(){
        System.out.println("sending sms notification");

    }
    public static void sendWhatsappNotification(){
        System.out.println("WhatApp Notification");
    }

}
