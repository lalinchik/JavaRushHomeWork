package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив
любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String>[] arrayLists = new ArrayList[2];
        arrayLists[0] = new ArrayList<String>();
        arrayLists[0].add("aaaa");
        arrayLists[0].add("aaaa");
        arrayLists[0].add("aaaa");
        arrayLists[0].add("aaaa");
        arrayLists[1] = new ArrayList<String>();
        arrayLists[1].add("aaaa");
        arrayLists[1].add("aaaa");
        arrayLists[1].add("aaaa");
        arrayLists[1].add("aaaa");
        arrayLists[1].add("aaaa");

        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}