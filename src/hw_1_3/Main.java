package hw_1_3;

import java.util.*;
import java.util.HashMap;
import java.util.Map.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
         * из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.
         */
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        String[]    fruits = {"apple",
        "orange","banana","banana","pear" ,"orange",
        "apple","pear" ,"orange","apple","plum"
        };

        for (int i = 0; i < fruits.length ; i++) {
            if (map.containsKey(fruits[i])){
                map.put(fruits[i], map.getOrDefault(fruits[i], 0)+1);

            }else {
                map.put(fruits[i], 1);
                map2.put(fruits[i], 1);

            }

        }
        System.out.println("Уникальных слов "+map2);
        System.out.println("Встречаются раз "+ map.toString());
        /**
         * Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
         * В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
         */

        phone("Petrov");
    }

    public static void phone(String name) {
        HashMap<String, PhoneDirectory> mm = new HashMap<>();
        mm.put("22-77-555", new PhoneDirectory("Petrov"));
        mm.put("22-78-555", new PhoneDirectory("Ivanov"));
        mm.put("22-79-555", new PhoneDirectory("Sidorov"));
        mm.put("22-77-777", new PhoneDirectory("Petrov"));

        for (HashMap.Entry<String, PhoneDirectory> o : mm.entrySet()) {
            if (o.getValue().getName().equals(name)) {
                System.out.println(o.getKey() + ": " + o.getValue().getName());
            }
        }
    }
}

