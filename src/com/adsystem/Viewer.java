package com.adsystem;

import javafx.util.Pair;

import java.util.ArrayList;

public class Viewer {
    private String name;
    private String birthDay;
    private ArrayList<Pair<Interest, Integer>> interests;
    private Gender gender;
    private Country country;
    private City city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
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
}
