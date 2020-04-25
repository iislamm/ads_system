package com.adsystem;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Date;

public class Viewer {
    private String name;
    private Date birthDay;
    private ArrayList<Pair<Interest, Integer>> interests;
    private Gender gender;
    private Country country;
    private City city;
    private ArrayList<Pair<Advertisement, Boolean>> seenAds;

    public Viewer(String name, Date birthDay, ArrayList<Pair<Interest, Integer>> interests, Gender gender, Country country, City city) {
        this.name = name;
        this.birthDay = birthDay;
        this.interests = interests;
        this.gender = gender;
        this.country = country;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public ArrayList<Pair<Interest, Integer>> getInterests() {
        return interests;
    }

    public void setInterests(ArrayList<Pair<Interest, Integer>> interests) {
        this.interests = interests;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void addSeenAdd(Advertisement ad, boolean action) {
        this.seenAds.add(new Pair(ad, action));
    }
}
