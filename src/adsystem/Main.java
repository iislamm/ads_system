package adsystem;
import adsystem.customtypes.Pair;

public class Main {

    public static void main(String[] args) {
        DataGenerator.feedFiles();
        Feed f = new Feed();
        f.matchViewerAds();
        for (Pair<Advertisement,Float> ad: f.getCurrentAds()) {
            System.out.print(ad.getKey().getTargetInterests());
            System.out.println("\t" + ad.getValue());
        }
        System.out.println("----------------------------------------");
        f.test();
        for (Pair<Advertisement,Float> ad: f.getCurrentAds()) {
            System.out.print(ad.getKey().getTargetInterests());
            System.out.println("\t" + ad.getValue());
        }
        System.out.println("----------------------------------------");
        f.test();
        for (Pair<Advertisement,Float> ad: f.getCurrentAds()) {
            System.out.print(ad.getKey().getTargetInterests());
            System.out.println("\t" + ad.getValue());
        }
        System.out.println("----------------------------------------");
        f.test();
        for (Pair<Advertisement,Float> ad: f.getCurrentAds()) {
            System.out.print(ad.getKey().getTargetInterests());
            System.out.println("\t" + ad.getValue());
        }
        System.out.println("----------------------------------------");
        f.test();
        for (Pair<Advertisement,Float> ad: f.getCurrentAds()) {
            System.out.print(ad.getKey().getTargetInterests());
            System.out.println("\t" + ad.getValue());
        }
        System.out.println("----------------------------------------");
        f.test();
        for (Pair<Advertisement,Float> ad: f.getCurrentAds()) {
            System.out.print(ad.getKey().getTargetInterests());
            System.out.println("\t" + ad.getValue());
        }
    }
}
