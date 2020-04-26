package adsystem;

//import javafx.util.Pair;

import adsystem.customtypes.Pair;

import java.util.ArrayList;
import java.util.Date;

public class Viewer {
    private String name;
    private ArrayList<Pair<Interest, Integer>> interests;

    private ArrayList<Pair<Advertisement, Boolean>> seenAds;

    public Viewer(String name, Date birthDay, ArrayList<Pair<Interest, Integer>> interests) {
        this.name = name;
        this.interests = interests;
        this.seenAds = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Pair<Interest, Integer>> getInterests() {
        return interests;
    }

    public void setInterests(ArrayList<Pair<Interest, Integer>> interests) {
        this.interests = interests;
    }

    public void addSeenAdd(Advertisement ad, boolean action) {
        this.seenAds.add(new Pair(ad, action));
    }

    public ArrayList<Pair<Advertisement, Boolean>> getSeenAdds() {return this.seenAds;}
}
