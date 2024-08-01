package Daily_Leet_Code;

public class SumofUniqueElements1748 {
    public static void main(String[] args) {
            int [] nums = {1,2,3,2};
        System.out.println(sumofUnique(nums));
    }
    public static int sumofUnique(int []nums){
            int sum = 0 ;
            for (int i : nums){
                boolean unique = Unique(i , nums);
                if (unique){
                    sum = sum+i;
                }
            }
            return sum;
        }

        public static boolean Unique(int nums, int[]arr) {
            int count =0;
            for (int i : arr){
                if (i==nums){
                    ++count;

                }
                if (count>1){
                    return false;
                }
            }
            return true;
        }
}
