package clW_1;

public class Cat implements   JumpRunnable{
    private String name;

    public Cat(String name) {
        this.name = name;
    }
// конструктором вызываем имплементс
    @Override
    public void jamp() {
        System.out.println(name + ".. jamp");
    }

    @Override
    public void run(int dist) {
        System.out.println(name + ".. run "+ dist);
    }
}
