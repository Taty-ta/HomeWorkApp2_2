package hw_1;

public class Cat implements Athletes {
    private String name;
    // ограничения для кота
    private int h = 1;
    private int d = 5;

    public Cat(String name) {
        this.name = name;
    }

    public void jamp() {
        System.out.println(name + "  взял разгон");
    }
    public boolean jamp2(int height) {
       if (h < height) {
           System.out.println(name + " не преодолел стену " + height + " метр");
           return false;
       }else {
           System.out.println(name + " успешно преодолел стену " + height + " метр");
           return true;
       }
    }

    public void run(int dist) {
        System.out.println(name + " взял старт");
    }
    public boolean run2(int dist) {
        if (d < dist) {
            System.out.println(name + " сошел с дистанции " + dist + " метров");
            return false;

        }else {
            System.out.println(name + " успешно прошел дистанцию "+ dist+ " метров");
            return true;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
