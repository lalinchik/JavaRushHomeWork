package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Alina on 22.10.2015.
 */
public class USD extends Money {

    public USD(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return super.getAmount();
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
