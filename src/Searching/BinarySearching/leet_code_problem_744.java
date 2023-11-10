package Searching.BinarySearching;

// Link to problem - https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// Nmae of the problem -  Find Smallest Letter Greater Than Target

public class leet_code_problem_744 {
    public static void main(String[] args) {
     char [] letters = {'c' ,'f','j'};
     char target = 'e';
        System.out.println(nextGreatestLetter(letters , target));
    }

   static public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            // find the mid
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;

            }
            else  {
                start = mid + 1;
            }

        }

         return letters[start%letters.length];


    }
}


