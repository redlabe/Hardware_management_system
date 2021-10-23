package com.hardware;

import java.util.ArrayList;
import java.util.List;


public class Notification {
    private List<Attendant> att = new ArrayList<>();
    String title;
    public void join(Attendant staff) {
        att.add(staff);
    }
    public void exit(Attendant staff) {
        att.remove(staff);
    }
    public void notifyAttendants() {
        for(Attendant att: att) {
            att.sendNotification();
        }
    }
    public void upload(String title) {
        this.title = title;
        notifyAttendants();
    }
}

