package adsystem;

import java.util.ArrayList;

public class Advertiser {
    private String name;
    private ArrayList<Advertisement> advertisements;
    private float totalSpent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
