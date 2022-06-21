package leetcodes;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));

    }

    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        int currentCount = 0;
        int largestCount = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i != nums.length - 1) {
                if (nums[i + 1] == nums[i] + 1) {
                    currentCount += 1;
                }
            } else {
                if (nums[i] - 1 == nums[i - 1]) {
                    currentCount += 1;
                }
            }
        }

        return currentCount;
    }
}
