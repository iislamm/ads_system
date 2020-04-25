package com.adsystem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Feed f = new Feed();
        f.matchViewerAds();
        for (var ad: f.getCurrentAds()) {
            System.out.print(ad.getKey().getTargetInterests());
            System.out.println("\t" + ad.getValue());
        }
    }
}
