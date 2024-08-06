package Daily_Leet_Code;

public class FIndMinimuOperationtoMakeAllElementsDivisiblebyThree3190 {
    public static void main(String[] args) {
            int [] nums ={1,2,3,4};
        System.out.println(minimumOperations(nums));
    }
    public static int minimumOperations(int[] nums) {
                int res = 0;
                for (int num : nums){
                    if (num%3!=0){
                        res++;
                    }
                }
                return res;
    }
}
