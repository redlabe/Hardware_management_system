package com.hardware;


public class Attendant {
    private String name;
    private Notification not = new Notification();

    public Attendant(String name) {
        super();
        this.name = name;
    }
    public void sendNotification() {
        System.out.println("Hello, " + name + " " + not.title);
    }
    public void joinDepartment(Notification mess) {
        not = mess;
    }
}

