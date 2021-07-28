package clW_1;

public class Main {
    public static void main(String[] args) {
        /*Object j = "java";

        //джава строка, j объект. Что бы узнать длину строки объекта, нужно объект привести (закастить) к стоке
       // для проверки можно ли кастовать (к оберткам) Integer
        if (j instanceof  String) {
            System.out.println(((String) j).length());
        }*/

        Cat cat = new Cat("Murzik");
       /* //соберем в массив
        Jumpable[] jumpables = {
                new Cat("Murzik"),
                new Cat("Barsik"),
                new Kangaroo()
        };
        // реализуем интерфейс. Соберем независымые классы и применим полиморфизм
       // полиморфизм
        for (int i = 0; i < jumpables.length; i++) {
            jumpables[i].jamp();
        }*/
       // tryJump2(cat);// может прыгать
        tryRun(cat, 5);
        /*Mouse m = new Mouse();
        tryJump(m);*/
    }
// соберем только прыгающих
      /*  static void tryJump(JumpRunnable j ){
            j.jamp();

        }*/
        static void tryRun (JumpRunnable r,int distance){
            r.run(distance);
            r.jamp();
    }
}
