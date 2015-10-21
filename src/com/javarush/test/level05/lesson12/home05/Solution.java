package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int a = Integer.parseInt(str);
        int sum = 0;

        while (true){
            sum += a;
            str = reader.readLine();
            if(str.equals("сумма")){
                break;
            } else {
                a = Integer.parseInt(str);
            }
        }
        System.out.println(sum);
    }
}
