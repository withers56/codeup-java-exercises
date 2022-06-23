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
                }
            }
        }

        return solution;
    }
}
