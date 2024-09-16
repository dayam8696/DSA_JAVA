package Daily_Leet_Code;

import java.util.Arrays;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public  static  boolean containsDuplicate(int[] nums) {
        // Outer loop to pick each element one by one
        for (int i = 0; i < nums.length; i++) {
            // Inner loop to compare the current element with every other element
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    // If a duplicate is found, return true
                    return true;
                }
            }
        }
        // If no duplicates are found, return false
        return false;
}
}

