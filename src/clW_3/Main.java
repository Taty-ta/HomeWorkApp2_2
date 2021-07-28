package clW_3;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
      //ArrayList
       List<Integer> list = new ArrayList<>(1000);// сразу задали размер
        // или увеличить принудительно
     //   ((ArrayList)list).ensureCapacity(2000);
       // если массив большой, и нужно обрезать и оставить поменьше
     //   ((ArrayList)list).trimToSize();
      /*  list.add(5);//добавить элемент
        list.add(1);
        list.add(9);
        list.add(9);
        list.add(3);
        list.add(2);*/
        list.addAll(Arrays.asList(7,5,5,8,9,2)) ;// addAll добавить коллекцию, asList
       // System.out.println(list);
        /*List<Integer> list2 = new ArrayList<>(Arrays.asList(7,5,5,8,9,2));
        System.out.println(list2);*/
       // list.add(2, 78);// вставка, добавление в определенную позицию
       // list.addAll(5, Arrays.asList(22,44,55,33,22)); // в пятое место бобавить пачку элементов
       // System.out.println(list);
        // удаление
     //   list.remove(2);// индекс
      //  list.remove((Integer) 2);//объект
// удалить все двойки
       /* list.removeAll(Arrays.asList(2, 9, 5 ));// какие коллекции удалить
        list.removeIf(x -> x ==2);// удалить по условию "удалить х еслт он равен 2Э
        list.removeIf(x -> x > 5 && x <9);
        list.removeIf(x -> x !=9);// все что не 9,, x%2 !=0 - нечетные*/
 /* list.removeIf(new Predicate<Integer>() {
      @Override
      public boolean test(Integer integer) {
          return x==3;
      }
  });*/
//
       // list.replaceAll(x-> x+5); //увеличить все объекты коллекции на 5
       /* list.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x<5 ? -x : x* 10; // если х< 5, тогда х отрицательный, иначе х*10
            }
        });
        list.replaceAll(x-> x%2==0 ? x *2: x); // если х четное, то умножаем на 2, иначе ничего
        list.contains();// проверка истина или ложь
        //list.sort(Comparator.naturalOrder()); // cортировка в прямом порядке по увеличению
   list.sort(Comparator.reverseOrder()); // обратном порядке
        list.sort(Comparator.comparingInt(x-> x%2)); // сначала выведутся те у которых остаток от деления 0, потом 1// поусловию поискать пример

*/

       // List<String> strList = new ArrayList<>(Arrays.asList("Barsik", "Murzik","Yo");
     //   strList.sort(Comparator.comparing(x-> x.length()));// отсортировать по длине
     //   strList.sort(Comparator.naturalOrder(strList)); //сортир по алфавиту
     //   System.out.println(list);
//list.get(3); // по индексу вытащить
     //   list.set(4,777)//заменить по индексу
     //   list.indexOf(2);// вернет индекс первого места в котором значение 2
     //   list.lastIndexOf(2); // // вернет индекс последнего места в котором значе
 //  list.isEmpty();// пустой не пустой
      //  list.subList(2, 4);// кусочек массива в отдельный массив

        //LinkedList
        //List<Integer> ll = new LinkedList<>(list);
      //  Queue //очередь в кабинет fifo
 /*       Queue<String> queue = new LinkedList<>();
        queue.add("aaa");
        queue.add("www");
        queue.add("eee");
        queue.add("rrr");
        queue.add("ttt");
        for (int i = 0; i < 5; i++) {
            System.out.println(queue.remove());
        }
    //lifo
    Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        for (int i = 0; i < 5; i++) {
        System.out.println(stack.pop()); // вытащить
    }
        // повторение не допускает
        Set<Integer> set = new HashSet<>();// хранят данные в виде массива, добавляет в произвольном порядке
        //Set<Integer> set = new LinkedHashSet<>();// хранят данные в виде массива, помнит кто чего добавлялся,  вкаком порядке добавляли в таком и вывелось
        //Set<Integer> set = new TreeSet<>();// данные в порядке возрастания выведуться
        set.add(4);
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(6);

        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        Set<Integer> setB = new HashSet<>(Arrays.asList(5,6,7,8,9));
        //set.retainAll(setB);// выведет общие цифры 567
        set.addAll(setB);// левое объединение
        set.removeAll(setB);// только в первой таблице

        // мапы
        Map<String, Integer> map = new HashMap<>();
       *//* Map<String, Integer> map = new LinkedHashMap<>();
        Map<String, Integer> map = new TreeMap<>();*//*
map.put("Barsik", 4);
        map.put("murzik", 5);
        map.put("Vacka", 7);
       // map.put("Barsik", 4);//перезапишет
        map.putIfAbsent("Barsik", 4);// при отсутствии запишет, иначе проигнорит
        map.get("Barsik");
        map.getOrDefault("murzik", "Asty"); // значение астиппо умолчанию
        map.keySet();// возврат ключей
        map.values();// возврат значений
        map.merge();// j,]tlbyztn
// обход мапы
       *//* for (Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }*//*
map.forEach(new BiConsumer<String, Integer>() {
    @Override
    public void accept(String key, Integer velues) {
        System.out.println(key+ " "+ velues);
    }
});

//
        Random random = new Random();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 100; i++) {
           int num = random.nextInt(10);
           map.put(num, map.getOrDefault(num, 0)+1); //- вернет либо 0 либо сколько штук уже лежит+ добавит 1 и заново запишет
           *//*Integer val = map.get(num);
           if (val == null){
               map.put(num, 1);
           }else {
               map.put(num, val+ 1);
           }*//*


            // System.out.println(+" ");
        }

        Map<String, List> mm = new HashMap<>();
        mm.put("aaaa", new ArrayList());*/

}
}
