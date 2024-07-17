package Daily_Leet_Code;

public class MonotonicArra {
    public static void main(String[] args) {
            int [] nums = {1,2,3,2};
        System.out.println(isMonotonicArray(nums));
    }

    public static boolean isMonotonicArray(int[] nums){
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < nums.length-1 ; i++) {
            if (nums[i]< nums[i+1]){
                decreasing =false;
            }
            if (nums[i]> nums[i+1]){
             increasing =false;
            }
        }
        return increasing || decreasing;
    }
}
