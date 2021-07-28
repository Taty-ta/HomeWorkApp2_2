package hw_1_3;

import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class Phone {
    // композиция - берем классы и используем их у себя в качестве полей
private Map<String,Set<String>> pb = new HashMap<>();// set что бы поля не дублировались

public void add(String name, String phone){
    Set<String > tell = pb.getOrDefault(name, new HashSet<>());// вытаскиваем список номеров по фамирии
    // если нет фамилии то создаем новый хэш сет и ее вытаскиваем
    tell.add(phone);// к  сету tell добавляем номер
    pb.put(name,tell);// записываем в книгу
}
public Set<String> get(String name){
return pb.get(name); // или pb.getOrDefault(name, new HashSet<>())
    }
}
