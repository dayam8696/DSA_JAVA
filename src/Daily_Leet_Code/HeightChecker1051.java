package Daily_Leet_Code;

import java.util.Arrays;

public class HeightChecker1051 {
    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
      //  int result = heightChecker(heights);

        System.out.println(result);
    }
    public int heightChecker(int[] heights) {
        // Create a copy of the original array
        int[] expected = heights.clone();

        // Sort the copied array to get the expected order
        Arrays.sort(expected);

        int count = 0;

        // Compare each element in the original and sorted arrays
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
}
