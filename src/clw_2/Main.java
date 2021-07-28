package clw_2;

public class Main {
    public static void main(String[] args) {
       /* try{
            a();
           *//* int a = 0;
            int b = 10;
            System.out.println(b / a); //ArithmeticException
            System.out.println("aaaa");*//*
    }catch (ArithmeticException e) {
            //  System.out.println("Пойиали ArithmeticException");
            //у е есть методы
            // System.out.println(e.getMessage()); // деление на ноль / by zero
            // System.err.println("aaa");// канал эроров
            e.printStackTrace(); // для распечатки троссировки стека (стек вызовов метода)
                                           *//* java.lang.ArithmeticException: / by zero
                                            at clw_2.Main.c(Main.java:27)
                                            at clw_2.Main.b(Main.java:22)
                                            at clw_2.Main.a(Main.java:19)
                                            at clw_2.Main.main(Main.java:5)*//*

        }
    }
    public static void a(){
b();
    }
    public static void b(){
c();
    }
    public static void c(){
        int a = 0;
        int b = 10;
        System.out.println(b / a); //ArithmeticException
    }
*/
        /////////////////////////////////////////////////
        /*try {
            // String s = null;
            //System.out.println(s.length()); //NullPointerException
            *//*int a = 10;
            int b = 10;
            System.out.println(b / a); //ArithmeticException*//*
            //внутренний
            try {
                int[] arr = {4, 5, 6};
                System.out.println("Тут должна быть ошибка");
                arr[99] = 77; // обратились к несуществующему индекс// ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) { // наследуются от RuntimeException и ниже по иерархии, поэтому
                // они никогда не будут выпорнены рантайм их перехватит, поэтому рантайм может быть только в конце


                e.printStackTrace(); // для распечатки троссировки стека (стек вызовов метода)
//throw e;// для того что бы код шел дальше, ошибку поймалт и сгенерировали
                throw new RuntimeException("Сами бросили", e);
               *//* java.lang.RuntimeException: Сами бросили
                at clw_2.Main.main(Main.java:54)
                Caused by: java.lang.ArrayIndexOutOfBoundsException: 99
                at clw_2.Main.main(Main.java:47)*//*
            }


            //ArithmeticException | ArrayIndexOutOfBoundsException e
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {


            e.printStackTrace(); // для распечатки троссировки стека (стек вызовов метода)

        }

        System.out.println("end");
        System.out.println(mySqrt(-9));
    }

    public static double mySqrt(double x) {
        if (x < 0) {
            throw new IllegalAccessException("Отрицательный аргумент " + x);
        }
        return Math.sqrt(x);

    }*/

        ///////////////////////////////////////////////
        try {

            int a = 10;
            int b = 10;
            System.out.println(b / a); //ArithmeticException

            /*int[] arr = {4, 5, 6};
            System.out.println("Тут должна быть ошибка");
            arr[99] = 77; // обратились к несуществующему индекс// ArrayIndexOutOfBoundsException*/
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally"); // всегда выполняется
        }
        System.out.println(sum(10, 20));
       try {
           System.out.println(fact(-5));
       }catch (Factorial e){
           e.printStackTrace();
           System.out.println(e.getMessage());
           System.out.println(e.getNamber());
       }

    }

    public static int sum(int a, int b) {
        try {
            return a + b; // выполнится ретерн из блока файноли, вернет 5
        } finally {
            return 5;
        }

    }

    // вычислим факториал
    public static int fact(int n) throws Factorial { //alt+enter- добавится throws Factorial
        if (n <= 0) {
            throw new Factorial("Аргумент отрицательный ", n);
        }
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
