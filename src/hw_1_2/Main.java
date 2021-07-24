package hw_1_2;

import clw_2.Factorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[][] str = {
                {"5", "6", "7", "8"},
                {"1", "2", "3"},
                {"4", "3", "2", "1смсм"},
                {"9", "8", "7", "6"}
        };
        // проверим количество строк
        try {
            lenArr(str.length);
        } catch (MyArraySizeException e) {
            System.out.println("Нарушен размер подаваемого, строк " + (str.length));
        }
        for (int i = 0; i < str.length; i++) {
            // определим в какой строке не хватает символов
            try {
                lenArr(str[i].length);
            } catch (MyArraySizeException e) {
                System.out.println("Нарушен размер подаваемого массива, строка " + (i + 1));
            }
        }
        sumNambers(str);

    }

    public static void lenArr(int a) throws MyArraySizeException {
        int c = 4;
        if (c != a) {
            throw new MyArraySizeException(a);

        }
    }

    public static void sumNambers(String[][] arrey) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;
        for (int i = 0; i < arrey.length; i++) {
            for (int j = 0; j < arrey[i].length; j++) {

                try {
                    sum +=  Integer.parseInt(arrey[i][j]);

                } catch (NumberFormatException e) {
                   //throw new MyArrayDataException("Пойиали NumberFormatException  в ячейке " ,i ,j);
                    System.out.println("Пойиали NumberFormatException  в ячейке " + arrey[i][j]);

                }
            }

        }
        System.out.println(sum);
    }
}





