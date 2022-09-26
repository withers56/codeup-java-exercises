package codewars;

public class MaximumSubarraySum {

    public static void main(String[] args) {

    }

//    The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:
//
//              Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
////            should be 6: {4, -1, 2, 1}
//    Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list
//    is made up of only negative numbers, return 0 instead.
//
//    Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.

    public static int sequence(int[] arr) {
        if(arr.length < 1) {
            return 0;
        }

        int size = arr.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here
                = 0;

        boolean hasPositiveNumber = false;

        for (int i = 0; i < size; i++) {

            if(arr[i] >= 0) {
                hasPositiveNumber = true;
            }

            max_ending_here = max_ending_here + arr[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }

        if(!hasPositiveNumber) {
            return 0;
        }
        return max_so_far;
    }
}
