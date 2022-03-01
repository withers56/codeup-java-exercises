package main;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;

        while (i <= 15){
            System.out.println(i);
            i++;
        }

        int j = 100;

        do {
            System.out.println(j);

            j -= 5;

        }while (j >= -10);
    }
}
