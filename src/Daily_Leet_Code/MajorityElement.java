package Daily_Leet_Code;

import java.util.Arrays;

public class MajorityElement {


    public static void main(String[] args) {
       // int[] nums1 = {3, 2, 3};
        int[] nums1 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums1));
    }
    public static int majorityElement(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        // Return the element at the middle index
        return nums[nums.length / 2];
    }

}

