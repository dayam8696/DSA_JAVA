package Daily_Leet_Code;

import java.util.List;

public class CountPairsWhoseSumisLessthanTarget2824 {
    public static void main(String[] args) {
        List<Integer> nums1 = List.of(-1, 1, 2, 3, 1);
        int target1 = 2;
        System.out.println(countPairs(nums1, target1));


    }
    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        int n = nums.size();

        // Iterate over all possible pairs
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }

        return count;
    }
}
