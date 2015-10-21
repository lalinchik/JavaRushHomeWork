package com.javarush.test.level12.lesson09.task02;

/* Интерфейсы Fly, Run, Swim
Напиши public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
Добавить в каждый интерфейс по одному методу.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

public interface Fly{
    void flying(String newAddress);
}
    public interface Run{
        void running(String newAddress, int speed);
    }

    public interface Swim{
        void swimming(int speed);
    }

}
