package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Alina on 22.10.2015.
 */
public class Singleton {
    private Singleton(){

    }
   static Singleton singleton = new Singleton();
    public static Singleton getInstance(){
            return Singleton.singleton;
    }
}
