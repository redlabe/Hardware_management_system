package com.hardware;


public class Management {

    public static void meetingNotification()
    {
        Notification n = new Notification();
        Attendant att1 = new Attendant("Attendant1");
        n.join(att1);
        att1.joinDepartment(n);
        n.upload("Kindly move to the boardroom for a brief meeting.");
    }

    public static void closingNotification()
    {
        Notification an = new Notification();
        Attendant att1 = new Attendant("Attendant1");
        an.join(att1);
        att1.joinDepartment(an);
        an.upload("The store will be closing soon, begin closing procedure");
    }
}

