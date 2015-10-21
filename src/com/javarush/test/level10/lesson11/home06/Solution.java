package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        String lastName;
        int age;
        boolean sex;
        int height;
        String mobNumber;

        public Human(){

        }

        public Human(String name, String lastName, int age, boolean sex, int height, String mobNumber) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.mobNumber = mobNumber;
        }

        public Human(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public Human(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String name, String lastName, int age, boolean sex) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String lastName, int age, boolean sex, int height) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.height = height;
        }

        public Human( String lastName, int age, boolean sex, int height, String mobNumber) {
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.mobNumber = mobNumber;
        }

        public Human(String lastName, int age, boolean sex, int height) {
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.height = height;
        }

        public Human(String lastName, int age, boolean sex, String mobNumber) {
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.mobNumber = mobNumber;
        }

        public Human(String name, int age, int height, String mobNumber) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.mobNumber = mobNumber;
        }

    }
}
