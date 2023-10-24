package Searching.LinearSearching;
// finding out even no digit in an Array
public class Leetcode_even_number_of_digit_in_array {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumber(nums));
    }

    static int findNumber(int[] nums) {
        int count = 0;
       for(int num :nums){
           if (even(num)){
           count++;}
        }
        return count;
    }

    // function to check that number contains even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2==0){
            return true;
        }
        return false;
    }

    // count number of digit in a number
    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}


