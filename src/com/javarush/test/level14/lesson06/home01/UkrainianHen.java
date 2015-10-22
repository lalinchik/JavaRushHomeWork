package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Alina on 22.10.2015.
 */
public class UkrainianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 60;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
