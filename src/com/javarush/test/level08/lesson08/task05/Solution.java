package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Familiya1", "Name1");
        map.put("Familiya2", "Name1");
        map.put("Familiya3", "Name2");
        map.put("Familiya4", "Name2");
        map.put("Familiya5", "Name3");
        map.put("Familiya6", "Name4");
        map.put("Familiya7", "Name5");
        map.put("Familiya8", "Name6");
        map.put("Familiya9", "Name7");
        map.put("Familiya10", "Name8");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> map2 = new HashMap<String, String>(map);
        HashMap<String, String> map3 = new HashMap<String, String>(map);

        for (Map.Entry<String, String> pair : map2.entrySet())
        {
            map3.remove(pair.getKey());
            if (map3.containsValue(pair.getValue()))
                removeItemFromMapByValue(map, pair.getValue());
        }
    }



    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
