package Daily_Leet_Code;

public class NumberofSubarraysWithOddSum1524 {

        public static  int numOfSubarrays(int[] arr) {
            final int MOD = 1_000_000_007;
            int oddCount = 0, evenCount = 1;  // evenCount = 1 to include empty prefix
            int prefixSum = 0, result = 0;

            for (int num : arr) {
                prefixSum += num;  // Update running sum

                if (prefixSum % 2 == 0) {  // Even prefix sum
                    result = (result + oddCount) % MOD;
                    evenCount++;  // Increase count of even prefix sums
                } else {  // Odd prefix sum
                    result = (result + evenCount) % MOD;
                    oddCount++;  // Increase count of odd prefix sums
                }
            }
            return result;
        }

    public static void main(String[] args) {
        int [] arr = {1,3,5};
        System.out.println(numOfSubarrays(arr));
    }
    }


