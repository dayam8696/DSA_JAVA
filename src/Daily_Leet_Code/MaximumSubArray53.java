package Daily_Leet_Code;

public class MaximumSubArray53 {
    public static void main(String[] args) {
            int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSubArray(nums));
    }
    public static int MaxSubArray(int [] nums){
        int sum = 0;
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum = sum+nums[i];
            if (sum>maxSum){
                maxSum = sum;
            }

            if (sum<0){
                sum=0;
            }

        }
        return maxSum;
    }
}
