package leetcodes;

import java.util.Arrays;

public class TwoSumII {
//    Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers
//    such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2]
//    where 1 <= index1 < index2 <= numbers.length.
//
//    Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
//
//    The tests are generated such that there is exactly one solution. You may not use the same element twice.
//
//    Your solution must use only constant extra space.
    public static void main(String[] args) {

        int[] numbers = {2,3,4};
        System.out.println(Arrays.toString(twoSum(numbers, 6)));
    }

    public static int[] twoSum(int[] numbers, int target) {

        int[] solution = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println(numbers[j]);
                if (numbers[i] + numbers[j] == target) {
                    solution = new int[]{i + 1, j + 1};
                    return solution;
                }
            }
        }

        return solution;
    }


    /*
    * This method starts at both ends of the array, it checks to see if equal, if not then if the total is less than the target,
    * the starting index increases to get a larger number, if its bigger than the target, the ending index increases to get a smaller
    *  total.
    * */
//    public int[] twoSum(int[] numbers, int target) {
//        int a_pointer = 0;
//        int b_pointer = numbers.length - 1;
//        int num_a, num_b;
//
//        while(a_pointer < b_pointer) {
//            num_a = numbers[a_pointer];
//            num_b = numbers[b_pointer];
//
//            if(num_a + num_b == target) break;
//
//            if(num_a + num_b < target) {
//                a_pointer++;
//                continue;
//            }
//
//            b_pointer--;
//
//        }
//
//        return new int[]{a_pointer + 1, b_pointer + 1};
//    }
}
