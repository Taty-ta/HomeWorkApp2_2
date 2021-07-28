package clw_2;

public class Factorial extends IllegalArgumentException{
private int namber;

    public Factorial(String s, int namber) {
        super(s);
        this.namber = namber;
    }

    public int getNamber() {
        return namber;
    }
}
