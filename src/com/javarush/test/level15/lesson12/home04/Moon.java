package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Alina on 29.10.2015.
 */
public class Moon implements Planet{
    private static Moon instance = null;

    private Moon(){

    }
    public static synchronized Moon getInstance() {
        if (instance == null)
            instance = new Moon();
        return instance;
    }
}
