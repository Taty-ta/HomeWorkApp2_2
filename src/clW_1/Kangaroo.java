package clW_1;

public class Kangaroo implements JumpRunnable{
    @Override
    public void jamp() {
        System.out.println("Kangaroo jamp!"); //интерфейсы не хранят состояния, много классов может реализовываться через 1 интерфейс

    }

    @Override
    public void run(int dist) {
        System.out.println("Kangaroo run...");
    }
}
