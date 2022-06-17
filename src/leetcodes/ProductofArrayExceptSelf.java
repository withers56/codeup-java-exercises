package leetcodes;

import java.util.Arrays;

//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the
//elements of nums except nums[i].
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
public class ProductofArrayExceptSelf {
//TODO: refactor to where i dont used nested for loop, takes too long on larger inputs.
    public static void main(String[] args) {
        ProductofArrayExceptSelf question = new ProductofArrayExceptSelf();

        int[] nums = {1,2,3,4};

        int[] soulution = question.productExceptSelf(nums);

        System.out.println(Arrays.toString(soulution));
    }

    public int[] productExceptSelf(int[] nums) {
        int[] arrayOfProducts = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int currentNumberProduct = 1;

            for (int j = 0; j < nums.length; j++) {
                if (j != i) {

                    currentNumberProduct *= nums[j];
                }
            }

            arrayOfProducts[i] = currentNumberProduct;
        }

        return arrayOfProducts;
    }
}
