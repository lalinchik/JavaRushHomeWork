package com.javarush.test.level08.lesson08.task03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Голуб", "Алина");
        map.put("Щербачок", "Алина");
        map.put("Гупало", "Тарас");
        map.put("Щербак", "Тамара");
        map.put("Насиннык", "Андрей");
        map.put("Ящук", "Николай");
        map.put("Вивчарык", "Наталия");
        map.put("Дудченко", "Павел");
        map.put("Фамилия", "Имя");
        map.put("Фам", "Им");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        ArrayList<String> list = new ArrayList<String>();
        for(Map.Entry<String, String> pair : map.entrySet()){
            list.add(pair.getValue());
        }
        for (String s : list){
            if (s.equals(name)) {
                count++;
            };
        }
       return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count = 0;
        ArrayList<String> list = new ArrayList<String>();
        for(Map.Entry<String, String> pair : map.entrySet()){
            list.add(pair.getKey());
        }
        for (String s : list){
            if (s.equals(familiya)) {
                count++;
            };
        }
        return count;
    }
}
