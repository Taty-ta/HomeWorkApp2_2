package hw_1_2;

public class MyArrayDataException extends RuntimeException{
    private int nStr;
    private int nCol;

    public MyArrayDataException(String message, int nStr, int nCol) {
        super(message);
        this.nStr = nStr;
        this.nCol = nCol;
    }

    public int getnStr() {
        return nStr;
    }

    public int getnCol() {
        return nCol;
    }
}
