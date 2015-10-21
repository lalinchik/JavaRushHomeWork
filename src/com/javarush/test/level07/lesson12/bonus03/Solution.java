package com.javarush.test.level07.lesson12.bonus03;

import javax.management.ObjectName;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    {
       Integer[] arr = new Integer[array.length];
        for (int i = 0; i < array.length; i++){
            arr[i] = array[i];
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < array.length; i++){
            array[i] = arr[i];
        }
    }

}
