package com.example.coolkidgatorclub.greenfootprint;

import java.util.ArrayList;

/**
 * Created by Emma on 1/20/2018.
 */
//https://androidresearch.wordpress.com/2012/03/22/defining-global-variables-in-android/
public class Globals {
    private static Globals instance;

    private ArrayList<Double> list = new ArrayList<Double>();

    private Globals(){}

    public void setData(double value) {
        list.add(value);
    }

    public ArrayList<Double> getData() {
        return list;
    }

    public static synchronized Globals getInstance() {
        if (instance == null) {
            instance = new Globals();
        }
        return instance;
    }
}
