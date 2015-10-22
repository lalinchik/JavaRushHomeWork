package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Alina on 22.10.2015.
 */
public class RussianHen extends Hen{
    @Override
   public int getCountOfEggsPerMonth() {
        return 2;
    }


   public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
