package com.adsystem;

import javafx.util.Pair;

import java.util.ArrayList;

public class Advertisement {
    private ArrayList<Interest> targetInterests;
    private ArrayList<Gender> targetGender;
    private Pair<Integer, Integer> targetAge;
    private ArrayList<Country> targetCountries;
    private ArrayList<City> targetCity;
    private int reachLimit;
    private float cost;

    public ArrayList<Interest> getTargetInterests() {
        return targetInterests;
    }

    public void setTargetInterests(ArrayList<Interest> targetInterests) {
        this.targetInterests = targetInterests;
    }

    public ArrayList<Gender> getTargetGender() {
        return targetGender;
    }

    public void setTargetGender(ArrayList<Gender> targetGender) {
        this.targetGender = targetGender;
    }

    public Pair<Integer, Integer> getTargetAge() {
        return targetAge;
    }

    public void setTargetAge(Pair<Integer, Integer> targetAge) {
        this.targetAge = targetAge;
    }

    public ArrayList<Country> getTargetCountries() {
        return targetCountries;
    }

    public void setTargetCountries(ArrayList<Country> targetCountries) {
        this.targetCountries = targetCountries;
    }

    public ArrayList<City> getTargetCity() {
        return targetCity;
    }

    public void setTargetCity(ArrayList<City> targetCity) {
        this.targetCity = targetCity;
    }

    public int getReachLimit() {
        return reachLimit;
    }

    public void setReachLimit(int reachLimit) {
        this.reachLimit = reachLimit;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
