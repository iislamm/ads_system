package adsystem;

//import javafx.util.Pair;

import adsystem.customtypes.Pair;

import java.io.Serializable;
import java.util.ArrayList;

public class Advertisement implements Serializable {
    private ArrayList<Interest> targetInterests;


    public Advertisement(ArrayList<Interest> targetInterests) {
        this.targetInterests = targetInterests;
    }

    public ArrayList<Interest> getTargetInterests() {
        return targetInterests;
    }

    public void setTargetInterests(ArrayList<Interest> targetInterests) {
        this.targetInterests = targetInterests;
    }


    @Override
    public String toString() {
        return "Advertisement{" +
                "targetInterests=" + targetInterests +
                '}';
    }
}
