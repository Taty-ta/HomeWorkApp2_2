package hw_1_2;

public class MyArraySizeException extends RuntimeException {
private int namber;

    public MyArraySizeException(int namber) {
        this.namber = namber;
    }


}
