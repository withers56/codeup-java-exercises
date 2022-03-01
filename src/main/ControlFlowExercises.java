package main;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;

//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }

        for (int i = 5; i <= 15; i++) {
            System.out.println(i);
        }

//        int j = 100;
//
//        do {
//            System.out.println(j);
//
//            j -= 5;
//
//        }while (j >= -10);

        for (int i = 100; i >= -10; i -= 5) {
            System.out.println(i);
        }

//        long k = 2;
//
//        do {
//            System.out.println(k);
//
//            k = k * k;
//        }while (k <= 1000000);

        for (long i = 2; i <= 1000000 ; i = i * i) {
            System.out.println(i);
        }
    }
}
