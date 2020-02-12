package Lab06.Models;

import java.util.*;

public class Book {
    private ArrayList<Buddy> buddies;
    private String info;

    public List<Buddy> getBuddies() {
        return buddies;
    }

    public String getInfo() {
        return info;
    }

    public void setBuddies(ArrayList<Buddy> buddies) {
        this.buddies = buddies;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void addBuddies(Buddy buddy) {
        if (this.buddies == null) {
            this.buddies = new ArrayList<Buddy>();
        }
        buddies.add(buddy);
    }

    public void setString() {
        info = "";
        for (Buddy b : buddies) {
            info += "{id: " + b.getId() + ", name: " + b.getName() + ", phone: " + b.getPhone() + "}\r\n";
        }
    }
}
