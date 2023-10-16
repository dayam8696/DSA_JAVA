package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode_Running_Sum_of_1__Array {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int[] sum = runningSum(nums);
        System.out.println(Arrays.toString(sum));


    }
    static int [] runningSum(int [] nums){
        int [] z = new int [nums.length+1];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

        }
        for (int i = 0; i < nums.length; i++) {
            z[i] = nums[i];


        }

        for (int i = 0; i < z.length; i++) {
            z[i+ nums.length] = sum;
            break;
        }
        return z;
    }
}
