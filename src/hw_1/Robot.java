package hw_1;

public class Robot implements Athletes {
    // ограничения для робота
    private int h =1;
    private int d = 5;

    public void jamp() {
        System.out.println("Robot взял разгон");
    }

    public boolean jamp2(int height) {
        if (h < height) {
            System.out.println("Robot не преодолел стену " + height + " метр");
            return false;

        } else {
            System.out.println("Robot успешно преодолел стену " + height + " метр");
            return true;
        }
    }

    public void run(int dist) {
        System.out.println("Robot взял старт");
    }

    public boolean run2(int dist) {
        if (d < dist) {
            System.out.println("Robot сошел с дистанции " + dist + " метров");
            return false;

        } else {
            System.out.println("Robot успешно прошел дистанцию " + dist + " метров");
            return true;
        }
    }

    @Override
    public String toString() {
        return "Robot{" +
                "Robot " +
                '}';
    }
}
