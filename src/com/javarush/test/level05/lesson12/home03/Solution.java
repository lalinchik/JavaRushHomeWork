package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика
Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

import com.javarush.test.level05.lesson09.task03.Dog;

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", 4, 3);
        Dog spaykDog = new Dog("Spayk", 40, 4);
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat
    {
        String name;
        int age;
        int width;

        public Cat(String name, int width, int age)
        {
            this.name = name;
            this.width = width;
            this.age = age;
        }

    }

    public static class Dog
    {
        String name;
        int age;
        int width;

        public Dog(String name, int width, int age)
        {
            this.name = name;
            this.width = width;
            this.age = age;
        }

    }
}