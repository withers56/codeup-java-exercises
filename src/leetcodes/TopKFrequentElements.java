package leetcodes;

public class TopKFrequentElements {

    public static void main(String[] args) {

        int [] nums = {1,1,1,2,2,3};
        topKFrequent(nums, 1);
    }
//    Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
    public static int[] topKFrequent(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return nums;
    }
}
