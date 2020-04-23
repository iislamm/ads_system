package com.adsystem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Feed f = new Feed();
        f.matchViewerAds();
        System.out.println(f.getCurrentAds().get(0).getTargetInterests());
    }
}
