package BitWise_Operator_Number_System;
//https://leetcode.com/problems/xor-operation-in-an-array/description/

public class XOROperation_in_an_Array_LeetCode {
    public static void main(String[] args) {
        XOROperation_in_an_Array_LeetCode solution = new XOROperation_in_an_Array_LeetCode();

        // Test case 1
        int n1 = 5;
        int start1 = 0;
        System.out.println("Output: " + solution.xorOperation(n1, start1)); // Output: 8

        // Test case 2
        int n2 = 4;
        int start2 = 3;
        System.out.println("Output: " + solution.xorOperation(n2, start2)); // Output: 8
    }

    public int xorOperation(int n, int start) {
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor ^= start + 2 * i;
        }
        return xor;
    }

}
