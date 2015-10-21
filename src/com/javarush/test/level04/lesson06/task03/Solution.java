package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;


public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        Integer[] array = {a, b, c};
        Arrays.sort(array, Collections.reverseOrder());
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }


    }
}
