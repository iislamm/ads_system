package com.adsystem;

//import javafx.util.Pair;

import com.adsystem.customtypes.Pair;

import java.util.ArrayList;
import java.util.Arrays;

public class Feed {
    private final Viewer currentUser;
    private final ArrayList<Advertisement> ads;
    private ArrayList<Pair<Advertisement, Float>> currentAds;
    Feed() {
        currentAds = new ArrayList<>();
        currentUser = DataGenerator.generateViewer();
        ads = DataGenerator.generateAds();
    }

    public ArrayList<Pair<Advertisement, Float>> getCurrentAds() {
        return currentAds;
    }

    public void matchViewerAds() {
        boolean addAd;
        for (Advertisement ad: ads) {
            addAd = false;
            var interests = ad.getTargetInterests();
            ArrayList<Pair<Interest, Integer>> viewerInterests;
            viewerInterests = currentUser.getInterests();
            for (Pair<Interest, Integer> viewerInterest : viewerInterests) {
                /*
                * if the user has only one interest, it has to be above the average
                */
                if (interests.contains(viewerInterest.getKey()) && viewerInterest.getValue() > 5) {
                    addAd = true;
                    break;
                }
            }

            if (addAd) rateAd(ad);
        }
    }

    public void addSorted(Advertisement ad , float rate) {
        this.currentAds.add(new Pair(ad, rate));
        Pair<Advertisement, Float>[] arr_ads = this.currentAds.toArray(new Pair[0]);
        this.sortAds(arr_ads, 0, arr_ads.length - 1);
        this.currentAds = new ArrayList<>(Arrays.asList(arr_ads));
    }

    private void sortAds(Pair<Advertisement, Float>[] ads, int low, int high) { // quick sort
        if (low < high) {
            int pi = partition(ads, low, high);
            sortAds(ads, low, pi-1);
            sortAds(ads, pi+1, high);
        }
    }

    private int partition(Pair<Advertisement, Float>[] ads, int low, int high) {
        float pivot = ads[high].getValue();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (ads[j].getValue() > pivot) {
                i++;

                var temp = ads[i];
                ads[i] = ads[j];
                ads[j] = temp;
            }
        }

        var temp = ads[i+1];
        ads[i+1] = ads[high];
        ads[high] = temp;

        return i+1;
    }

    private void rateAd(Advertisement ad) {

        var viewerInterests = this.currentUser.getInterests();
        float adValue = 0 , viValue = 0;
            for (var vi: viewerInterests) {
                viValue += vi.getValue();
                for (var ai: ad.getTargetInterests()){
                    if(vi.getKey() == ai){
                        adValue += vi.getValue();
                    }
                }
            }

            addSorted(ad, adValue / viValue);

    }

    public void adFeedback(Advertisement ad, boolean action) {
        this.currentUser.addSeenAdd(ad, action);
    }
}
