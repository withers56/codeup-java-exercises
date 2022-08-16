package codility;

import java.util.Arrays;

public class PracticeExercise {


    public static void main(String[] args) {

        System.out.println("Lowest int is: " + solution(new int[]{1, 3, 6, 4, 1, 2}));
    }

//    that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//    For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//    Given A = [1, 2, 3], the function should return 4.
//
//    Given A = [−1, −3], the function should return 1.

    public static int solution(int[] A) {
        //initalizing count at one because its the smalles possible int
        int count = 1;
        //sorting array into ascending order
        Arrays.sort(A);

        //loop through array
        for (int i = 0; i < A.length; i++) {
            // if number in array is equal to the count, increment by one
            if (A[i] == count) {
                count++;
            }
        }
        return count;
    }
}
