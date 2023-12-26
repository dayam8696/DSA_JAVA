package Searching.BinarySearching;
// ceiling problem on leet code solution
public class Question_Ceiling_of_a_Number {
    public static void main(String[] args) {
        // defining the array
        int[] arr = {2, 3 , 5 ,9,14,16,18, 90};
        int target = 14;
        int ans = ceiling(arr,target);
        System.out.println(ans);

    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the mid
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            }
            else if (target > arr[mid]) {
                start = mid + 1;
            } else{
                return mid;
            }

        }
        // to return the index of that element ceiling of the target:
        return start;

        // to return the value of that element ceiling of the target:
       // return arr[start] ;

    }
}
