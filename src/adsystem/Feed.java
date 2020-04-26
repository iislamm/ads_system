package adsystem;

import adsystem.customtypes.Pair;

import java.util.ArrayList;
import java.util.Arrays;

public class Feed {
    private static Feed uniqueInstance;
    private final ArrayList<Advertisement> ads;
    public Viewer currentUser;
    private ArrayList<Pair<Advertisement, Float>> currentAds;

    private Feed() {
        currentAds = new ArrayList<>();
        currentUser = DataGenerator.generateViewer();
        ads = DataGenerator.get_ads_from_file();
    }

    public static Feed getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Feed();
        }
        return uniqueInstance;
    }

    public ArrayList<Pair<Advertisement, Float>> getCurrentAds() {
        this.matchViewerAds();
        return currentAds;
    }

    /*
     * This function retrieves the most relevant advertisements to the user
     * This function implements the greedy algorithm
     * The analysis of the function at worst case is: O(n * m);
     */
    public void matchViewerAds() {
        currentAds = new ArrayList<>();
        boolean addAd;
        for (Advertisement ad : ads) {
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

    /*
     * This function adds the new relevant advertisement and then sorts the advertisements according to the relevancy to the user
     */
    public void addSorted(Advertisement ad, float rate) {
        this.currentAds.add(new Pair(ad, rate));
        Pair<Advertisement, Float>[] arr_ads = this.currentAds.toArray(new Pair[0]);
        this.sortAds(arr_ads, 0, arr_ads.length - 1);
        this.currentAds = new ArrayList<>(Arrays.asList(arr_ads));
    }

    /*
     * This function sorts the advertisements according to the relevancy to the user
     * This function implements the divide and conquer paradigm using quick sort algorithm
     * The analysis of the function at worst case is: O(n^2)
     */
    private void sortAds(Pair<Advertisement, Float>[] ads, int low, int high) { // quick sort
        if (low < high) {
            int pi = partition(ads, low, high);
            sortAds(ads, low, pi - 1);
            sortAds(ads, pi + 1, high);
        }
    }

    /*
     * This function is a helper function to sortAds
     */
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

        var temp = ads[i + 1];
        ads[i + 1] = ads[high];
        ads[high] = temp;

        return i + 1;
    }

    /*
     * The function rates the relevancy of the ad to the user
     * This function implements transfer and conquer paradigm
     * The analysis of the function at worst case is: O(n * m)
     */
    private void rateAd(Advertisement ad) {
        var viewerInterests = this.currentUser.getInterests();
        float adValue = 0, viValue = 0;
        for (var vi : viewerInterests) {
            viValue += vi.getValue();
            for (var ai : ad.getTargetInterests()) {
                if (vi.getKey() == ai) {
                    adValue += vi.getValue();
                }
            }
        }

        addSorted(ad, adValue / viValue);
    }

    /*
     * This function records the feedback of the user on the ad
     */
    public void adFeedback(Advertisement ad, boolean action) {
        this.currentUser.addSeenAdd(ad, action);
    }

    /*
     * This function updates the interests ratings of the user based on his or her recent feedback on the seen ads
     * This function implements the greedy algorithm
     * The analysis of the function at worst case is: O(m * k);
     */
    public void updateViewerInterestsRating() {
        var viewerInterests = this.currentUser.getInterests();
        for (var vi : viewerInterests) {
            for (var ad : this.currentUser.getSeenAdds()) {
                if (ad.getKey().getTargetInterests().contains(vi.getKey())) {
                    if (ad.getValue()) {
                        vi.setValue(vi.getValue() + 1);
                    } else {
                        vi.setValue(Math.max(vi.getValue() - 1, 0));
                    }
                }
            }
        }
    }
}
