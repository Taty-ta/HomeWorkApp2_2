package hw_1_1;

public class Main {
    public static void main(String[] args) {
        Weekday d = Weekday.Monday;
        workingWeekLength(d);
    }

    public static void workingWeekLength(Weekday d) {
        int sum = 40;
        if (d.ordinal() > 5) {
            System.out.println("Сегодня выходной");
        } else {
            System.out.println("Еще " + (sum - (d.ordinal() * 8)) + " рабочей недели");
        }
    }
}
