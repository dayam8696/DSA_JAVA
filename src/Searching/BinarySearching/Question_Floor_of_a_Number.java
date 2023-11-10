package Searching.BinarySearching;

public class Question_Floor_of_a_Number {
    public static void main(String[] args) {
        // defining the array
        int[] arr = {2, 3 , 5 ,9,14,16,18, 90};
        int target = 15;
        int ans = floor(arr,target);
        System.out.println(ans);

    }


    static int floor(int[] arr, int target) {
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
        return end;

        // to return the value of that element ceiling of the target:
        // return arr[start] ;

    }
}

