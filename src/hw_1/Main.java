package hw_1;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        int distanse = 5;
        int height = 1;
        //соберем в массив
        Athletes[] athletes = {
                new Cat("Barsic"),
                new Cat("Murzic"),
                new Man("Basiliy"),
                new Man("Stepan"),
                new Robot()
        };
        // реализуем интерфейс. Соберем независымые классы и применим полиморфизм
/**
 * Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
 */
// в один массив, если не прошли первую дистанцию, то на вторую не идут
        for (int i = 0; i < athletes.length; i++) {
            athletes[i].jamp(); // взяли разгон
            if (!Wall.truJump(athletes[i], height)) { // финишируют, но если не прошли то выбывают
                System.out.println(athletes[i].toString() + " не взял высоту, сошел с дистанции");
            } else {
                athletes[i].run(distanse); // взял разгон на второй дистанции
                if (!Treadmill.truRun(athletes[i], distanse)) {
                    System.out.println(athletes[i].toString() + " не добежал, сошел с дистанции");
                }
            }
        }

    }
}
