package Daily_Leet_Code;

public class MaximumCountofPositiveIntegerandNegativeInteger2529 {
    public static void main(String[] args) {
            int [] arr = {5,20,66,1314};
        System.out.println(maximumCount(arr));
    }
    public static int maximumCount(int[] nums) {
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0){
                negative++;
            } else if (nums[i]>0) {
                positive++;

            }
        }
        return Math.max(positive,negative);
    }
}
