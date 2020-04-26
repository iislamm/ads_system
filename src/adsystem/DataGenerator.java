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
        ArrayList<Gender> targetGenders = new ArrayList<>();
        targetGenders.add(Gender.Male);
        ArrayList<Country> targetCountries = new ArrayList<Country>();
        targetCountries.add(Country.Egypt);
        ArrayList<City> targetCities = new ArrayList<City>();
        targetCities.add(City.Cairo);
        ad = new Advertisement(targetInterests, targetGenders, new Pair<>(33, 50), targetCountries, targetCities, 5, 0);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Tech);
        targetGenders = new ArrayList<>();
        targetGenders.add(Gender.Male);
        targetCountries = new ArrayList<Country>();
        targetCountries.add(Country.Egypt);
        targetCities = new ArrayList<City>();
        targetCities.add(City.Cairo);
        ad = new Advertisement(targetInterests, targetGenders, new Pair<>(33, 50), targetCountries, targetCities, 5, 0);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Tech);
        targetInterests.add(Interest.Religon);
        targetGenders = new ArrayList<>();
        targetGenders.add(Gender.Female);
        targetCountries = new ArrayList<Country>();
        targetCountries.add(Country.Egypt);
        targetCities = new ArrayList<City>();
        targetCities.add(City.Alexandria);
        ad = new Advertisement(targetInterests, targetGenders, new Pair<>(20, 30), targetCountries, targetCities, 5, 0);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Health);
        targetInterests.add(Interest.SocialLife);
        targetGenders = new ArrayList<>();
        targetGenders.add(Gender.Male);
        targetCountries = new ArrayList<Country>();
        targetCountries.add(Country.Egypt);
        targetCities = new ArrayList<City>();
        targetCities.add(City.Alexandria);
        ad = new Advertisement(targetInterests, targetGenders, new Pair<>(18, 35), targetCountries, targetCities, 10, 0);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Poem);
        targetInterests.add(Interest.Sports);
        targetGenders = new ArrayList<>();
        targetGenders.add(Gender.Female);
        targetCountries = new ArrayList<Country>();
        targetCountries.add(Country.Egypt);
        targetCities = new ArrayList<City>();
        targetCities.add(City.Cairo);
        ad = new Advertisement(targetInterests, targetGenders, new Pair<>(30, 40), targetCountries, targetCities, 10, 0);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Events);
        
        targetGenders = new ArrayList<>();
        targetGenders.add(Gender.Male);
        targetCountries = new ArrayList<Country>();
        targetCountries.add(Country.Egypt);
        targetCities = new ArrayList<City>();
        targetCities.add(City.Cairo);
        targetCities.add(City.Giza);
        ad = new Advertisement(targetInterests, targetGenders, new Pair<>(18, 30), targetCountries, targetCities, 10, 0);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Events);
        targetInterests.add(Interest.Sports);
        targetGenders = new ArrayList<>();
        targetGenders.add(Gender.Male);
        targetGenders.add(Gender.Female);
        targetCountries = new ArrayList<Country>();
        targetCountries.add(Country.Egypt);
        targetCities = new ArrayList<City>();
        targetCities.add(City.Luxor);
        targetCities.add(City.Aswan);
        ad = new Advertisement(targetInterests, targetGenders, new Pair<>(20, 40), targetCountries, targetCities, 10, 0);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Literature);
        targetInterests.add(Interest.Poem);
        targetGenders = new ArrayList<>();
        targetGenders.add(Gender.Male);
        targetCountries = new ArrayList<Country>();
        targetCountries.add(Country.Egypt);
        targetCities = new ArrayList<City>();
        targetCities.add(City.Hurghada);
        targetCities.add(City.Cairo);
        targetCities.add(City.Giza);
        targetCities.add(City.SharmAlShaikh);
        ad = new Advertisement(targetInterests, targetGenders, new Pair<>(35, 60), targetCountries, targetCities, 10, 0);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Health);
        targetInterests.add(Interest.Sports);
        targetInterests.add(Interest.Events);
        targetInterests.add(Interest.SocialLife);
        targetGenders = new ArrayList<>();
        targetGenders.add(Gender.Male);
        targetGenders.add(Gender.Female);
        targetCountries = new ArrayList<Country>();
        targetCountries.add(Country.Egypt);
        targetCities = new ArrayList<City>();
        targetCities.add(City.Cairo);
        targetCities.add(City.Giza);
        ad = new Advertisement(targetInterests, targetGenders, new Pair<>(18, 40), targetCountries, targetCities, 10, 0);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Events);
        targetInterests.add(Interest.Tech);
        targetGenders = new ArrayList<>();
        targetGenders.add(Gender.Male);
        targetCountries = new ArrayList<Country>();
        targetCountries.add(Country.Egypt);
        targetCities = new ArrayList<City>();
        targetCities.add(City.Assuit);
        targetCities.add(City.Sohag);
        ad = new Advertisement(targetInterests, targetGenders, new Pair<>(18, 35), targetCountries, targetCities, 10, 0);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Health);
        targetInterests.add(Interest.Sports);
        targetGenders = new ArrayList<>();
        targetGenders.add(Gender.Male);
        targetCountries = new ArrayList<Country>();
        targetCountries.add(Country.Egypt);
        targetCities = new ArrayList<City>();
        targetCities.add(City.Cairo);
        ad = new Advertisement(targetInterests, targetGenders, new Pair<>(18, 60), targetCountries, targetCities, 10, 0);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Travel);
        targetInterests.add(Interest.Sports);
        targetGenders = new ArrayList<>();
        targetGenders.add(Gender.Male);
        targetGenders.add(Gender.Female);
        targetCountries = new ArrayList<Country>();
        targetCountries.add(Country.Egypt);
        targetCities = new ArrayList<City>();
        targetCities.add(City.Cairo);
         targetCities.add(City.Giza);
        ad = new Advertisement(targetInterests, targetGenders, new Pair<>(20, 40), targetCountries, targetCities, 10, 0);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Religon);
        targetGenders = new ArrayList<>();
        targetGenders.add(Gender.Male);
        targetGenders.add(Gender.Female);
        targetCountries = new ArrayList<Country>();
        targetCountries.add(Country.Egypt);
        targetCities = new ArrayList<City>();
        targetCities.add(City.Alexandria);
        ad = new Advertisement(targetInterests, targetGenders, new Pair<>(18, 60), targetCountries, targetCities, 10, 0);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Beauty);
        targetInterests.add(Interest.Makeup);
        targetGenders = new ArrayList<>();
        targetGenders.add(Gender.Female);
        targetCountries = new ArrayList<Country>();
        targetCountries.add(Country.Egypt);
        targetCities = new ArrayList<City>();
        targetCities.add(City.Cairo);
        ad = new Advertisement(targetInterests, targetGenders, new Pair<>(15, 30), targetCountries, targetCities, 10, 0);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Art);
        targetInterests.add(Interest.Animie);
        targetInterests.add(Interest.Events);
        targetGenders = new ArrayList<>();
        targetGenders.add(Gender.Male);
        targetGenders.add(Gender.Female);
        targetCountries = new ArrayList<Country>();
        targetCountries.add(Country.Egypt);
        targetCities = new ArrayList<City>();
        targetCities.add(City.Cairo);
        targetCities.add(City.Giza);
        ad = new Advertisement(targetInterests, targetGenders, new Pair<>(8, 16), targetCountries, targetCities, 10, 0);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Health);
        targetInterests.add(Interest.Events);
        targetGenders = new ArrayList<>();
        targetGenders.add(Gender.Male);
        targetCountries = new ArrayList<Country>();
        targetCountries.add(Country.Egypt);
        targetCities = new ArrayList<City>();
        targetCities.add(City.Cairo);
        ad = new Advertisement(targetInterests, targetGenders, new Pair<>(21, 40), targetCountries, targetCities, 10, 0);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Sports);
        targetInterests.add(Interest.Animie);
        targetGenders = new ArrayList<>();
        targetGenders.add(Gender.Male);
        targetCountries = new ArrayList<Country>();
        targetCountries.add(Country.Egypt);
        targetCities = new ArrayList<City>();
        targetCities.add(City.Cairo);
        targetCities.add(City.Giza);
        targetCities.add(City.SharmAlShaikh);
        targetCities.add(City.Hurghada);
        ad = new Advertisement(targetInterests, targetGenders, new Pair<>(20, 30), targetCountries, targetCities, 10, 0);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Animie);
        targetInterests.add(Interest.Tech);
        targetGenders = new ArrayList<>();
        targetGenders.add(Gender.Male);
        targetGenders.add(Gender.Female);
        targetCountries = new ArrayList<Country>();
        targetCountries.add(Country.Egypt);
        targetCities = new ArrayList<City>();
        targetCities.add(City.Luxor);
        targetCities.add(City.Aswan);

        ad = new Advertisement(targetInterests, targetGenders, new Pair<>(15, 30), targetCountries, targetCities, 10, 0);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Art);
        targetInterests.add(Interest.Events);
        targetGenders = new ArrayList<>();
        targetGenders.add(Gender.Male);
        targetCountries = new ArrayList<Country>();
        targetCountries.add(Country.Egypt);
        targetCities = new ArrayList<City>();
        targetCities.add(City.Cairo);
        ad = new Advertisement(targetInterests, targetGenders, new Pair<>(18, 33), targetCountries, targetCities, 10, 0);
        allAds.add(ad);

        targetInterests = new ArrayList<>();
        targetInterests.add(Interest.Art);
        targetInterests.add(Interest.Tech);
        targetGenders = new ArrayList<>();
        targetGenders.add(Gender.Male);
        targetCountries = new ArrayList<Country>();
        targetCountries.add(Country.Egypt);
        targetCities = new ArrayList<City>();
        targetCities.add(City.Cairo);
        targetCities.add(City.Giza);
        targetCities.add(City.Aswan);
        targetCities.add(City.Assuit);
        ad = new Advertisement(targetInterests, targetGenders, new Pair<>(20, 35), targetCountries, targetCities, 10, 0);
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

        Viewer viewer = new Viewer("Islam", now, viewerInterests, Gender.Male, Country.Egypt, City.Cairo);
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
