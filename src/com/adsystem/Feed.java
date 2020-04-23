package com.adsystem;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Date;

public class Feed {
    private Viewer currentUser;
    private ArrayList<Advertisement> currentAds;
    private ArrayList<Advertisement> ads;
    Feed() {
        currentAds = new ArrayList<Advertisement>();
        ArrayList<Pair<Interest, Integer>> viewerInterests = new ArrayList<>();
        viewerInterests.add(new Pair<>(Interest.Sports, 9));
        viewerInterests.add(new Pair<>(Interest.Travel, 5));
        viewerInterests.add(new Pair<>(Interest.Health, 3));
        Date now = new Date();
        Viewer viewer = new Viewer("Islam", now, viewerInterests, Gender.Male, Country.Egypt, City.Cairo);
        currentUser = viewer;

        ArrayList<Interest> targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Health);
        targetInterests.add(Interest.Travel);
        targetInterests.add(Interest.Sports);
        ArrayList<Gender> targetGenders = new ArrayList<>();
        targetGenders.add(Gender.Male);
        ArrayList<Country> targetCountries = new ArrayList<Country>();
        targetCountries.add(Country.Egypt);
        ArrayList<City> targetCities = new ArrayList<City>();
        targetCities.add(City.Cairo);
        Advertisement ad1 = new Advertisement(targetInterests, targetGenders, new Pair<>(18, 60), targetCountries, targetCities, 10, 0);
        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Tech);

        Advertisement ad2 = new Advertisement(targetInterests, targetGenders, new Pair<>(33, 50), targetCountries, targetCities, 5, 0);
        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Health);
        targetInterests.add(Interest.Sports);
        Advertisement ad3 = new Advertisement(targetInterests, targetGenders, new Pair<>(20, 30), targetCountries, targetCities, 5, 0);

        ads = new ArrayList<>();
        ads.add(ad1);
        ads.add(ad2);
        ads.add(ad3);
    }

    public ArrayList<Advertisement> getCurrentAds() {
        return currentAds;
    }

    public void matchViewerAds() {
        boolean addAd = true;
        for(Advertisement ad: ads){
            var interests = ad.getTargetInterests();
            ArrayList<Pair<Interest, Integer>> viewerInterests;
            viewerInterests = currentUser.getInterests();
            for (Pair<Interest, Integer> viewerInterest : viewerInterests)
                if (!interests.contains(viewerInterest.getKey())) {
                    addAd = false;
                    break;
                }

            if (addAd) currentAds.add(ad);
        }


    }
}
