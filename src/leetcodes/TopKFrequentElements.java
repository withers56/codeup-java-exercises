package leetcodes;

import java.io.ObjectOutput;
import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {

        int [] nums = {1,1,1,2,2,3};
        topKFrequent(nums, 2);
    }
//    Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> frequentNumsMap = new HashMap<>();
        int[] mostFrequentNumbers = new int[k];

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            if (!frequentNumsMap.containsKey(currentNum)) {
                frequentNumsMap.put(currentNum, 1);
            } else {
                frequentNumsMap.replace(currentNum, frequentNumsMap.get(currentNum), frequentNumsMap.get(currentNum) + 1);
            }
        }

        List<Map.Entry<Integer, Integer>> numsList = new LinkedList<>(frequentNumsMap.entrySet());
        numsList.sort(new Comparator<>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        for (int i = 0; i < k; i++) {
            mostFrequentNumbers[i] = (numsList.get(i).getKey());

        }
        System.out.println(numsList);
        System.out.println(Arrays.toString(mostFrequentNumbers));
        return mostFrequentNumbers;
    }
}
