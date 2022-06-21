package leetcodes;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        int[] nums = {1,2,0,1};
        System.out.println(longestConsecutive(nums));

    }

    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        int currentCount = 1;
        int largestCount = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i != nums.length - 1 && nums[i] == nums[i + 1] - 1) {
                currentCount++;
            } else {
                if (currentCount > largestCount) {
                    largestCount = currentCount;
                }
                currentCount = 1;
            }

        }

        return largestCount;
    }
}
