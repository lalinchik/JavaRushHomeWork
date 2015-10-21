package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String way = reader.readLine();
        OutputStream fileOutputStream = new FileOutputStream(way);
        while (true){
            String string = reader.readLine();
            if (string.equals("exit")){
                fileOutputStream.write(string.getBytes());
                break;
            } else
            {
                fileOutputStream.write((string+"\r\n").getBytes());
            }
        }

        fileOutputStream.close();
        reader.close();
        }
    }

