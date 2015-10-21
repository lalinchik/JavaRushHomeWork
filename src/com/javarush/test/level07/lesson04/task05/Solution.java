package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];
        for (int i = 0; i < list.length; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }

        int[] array1 = new int[list.length/2];
        int[] array2 = new int[list.length/2];

         System.arraycopy(list, 0, array1, 0, array1.length);
         System.arraycopy(list, 10, array2, 0, array2.length);

        for (int k : array2){
            System.out.println(k);
        }

    }

}
