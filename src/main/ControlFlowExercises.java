package main;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;

        while (i <= 15){
            System.out.println(i);
            i++;
        }

        int j = 0;

        do {
            if (j % 2 == 0){
                System.out.println(j);
            }
            j++;
        }while (j <= 100);
    }
}
