package adsystem;

//import javafx.util.Pair;
import adsystem.customtypes.Pair;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class DataGenerator {
    public static ArrayList<Advertisement> generateAds() {
        ArrayList<Advertisement> allAds = new ArrayList<>();
        Advertisement ad;
        ArrayList<Interest> targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Health);
        targetInterests.add(Interest.Travel);
        targetInterests.add(Interest.Sports);
        ad = new Advertisement(targetInterests);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Tech);
        ad = new Advertisement(targetInterests);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Tech);
        targetInterests.add(Interest.Religon);
        ad = new Advertisement(targetInterests);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Health);
        targetInterests.add(Interest.SocialLife);
        ad = new Advertisement(targetInterests);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Poem);
        targetInterests.add(Interest.Sports);
        ad = new Advertisement(targetInterests);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Events);

        ad = new Advertisement(targetInterests);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Events);
        targetInterests.add(Interest.Sports);
        ad = new Advertisement(targetInterests);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Literature);
        targetInterests.add(Interest.Poem);
        ad = new Advertisement(targetInterests);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Health);
        targetInterests.add(Interest.Sports);
        targetInterests.add(Interest.Events);
        targetInterests.add(Interest.SocialLife);
        ad = new Advertisement(targetInterests);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Events);
        targetInterests.add(Interest.Tech);
        ad = new Advertisement(targetInterests);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Health);
        targetInterests.add(Interest.Sports);
        ad = new Advertisement(targetInterests);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Travel);
        targetInterests.add(Interest.Sports);
        ad = new Advertisement(targetInterests);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Religon);
        ad = new Advertisement(targetInterests);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Beauty);
        targetInterests.add(Interest.Makeup);
        ad = new Advertisement(targetInterests);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Art);
        targetInterests.add(Interest.Animie);
        targetInterests.add(Interest.Events);
        ad = new Advertisement(targetInterests);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Health);
        targetInterests.add(Interest.Events);
        ad = new Advertisement(targetInterests);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Sports);
        targetInterests.add(Interest.Animie);
        ad = new Advertisement(targetInterests);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Animie);
        targetInterests.add(Interest.Tech);

        ad = new Advertisement(targetInterests);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Art);
        targetInterests.add(Interest.Events);
        ad = new Advertisement(targetInterests);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Art);
        targetInterests.add(Interest.Tech);
        ad = new Advertisement(targetInterests);
        allAds.add(ad);

        return allAds;
    }

    public static Viewer generateViewer() {
        ArrayList<Pair<Interest, Integer>> viewerInterests = new ArrayList<>();
        viewerInterests.add(new Pair<>(Interest.Sports, 9));
        viewerInterests.add(new Pair<>(Interest.Tech, 7));
        viewerInterests.add(new Pair<>(Interest.Travel, 5));
        viewerInterests.add(new Pair<>(Interest.Health, 3));
        viewerInterests.add(new Pair<>(Interest.SocialLife, 1));
        Date now = new Date();

        Viewer viewer = new Viewer("Islam", now, viewerInterests);
        return viewer;
    }

    public static void feedFiles() {

        var ads = DataGenerator.generateAds();
        DataGenerator.write_to_file(ads, "src/adsystem/data/ads.txt");
    }

    private static void write_to_file(ArrayList<Advertisement> o, String path) {
        File file = new File(path);
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(o);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Advertisement> get_ads_from_file() {
        File file = new File("src/adsystem/data/ads.txt");
        ArrayList<Advertisement> result = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            result = (ArrayList<Advertisement>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }


}