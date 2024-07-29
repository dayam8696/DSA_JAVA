package Daily_Leet_Code;

public class NumberofGoodPairs1512 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums1));
    }
    public static int numIdenticalPairs(int[] nums) {

        int goodPairs = 0;
        int n = nums.length;


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    goodPairs++;
                }
            }
        }

        return goodPairs;
    }

}
