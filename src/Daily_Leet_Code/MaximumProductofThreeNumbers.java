package Daily_Leet_Code;

import java.util.Arrays;

public class MaximumProductofThreeNumbers {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3,4};
        System.out.println("Maximum product of three numbers: " + maximumProduct(nums1));
    }
    public static int maximumProduct(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        // Compute the product of the three largest numbers
        int n = nums.length;
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Compute the product of the two smallest and the largest number
        int product2 = nums[0] * nums[1] * nums[n - 1];

        // Return the maximum of the two products
        return Math.max(product1, product2);///
    }
}
