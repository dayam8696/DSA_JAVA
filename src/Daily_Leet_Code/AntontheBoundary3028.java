package Daily_Leet_Code;

public class AntontheBoundary3028 {
    public static void main(String[] args) {
        int [] arr = {2,3,-5};
        System.out.println(returnToBoundaryCount(arr));
    }
    public static int returnToBoundaryCount(int[] nums) {
        int count = 0 ;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum==0){
                count++;
            }

        }
        return count;
    }
}
