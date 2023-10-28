package Searching.BinarySearching;

public class Binary_Searching {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 33, 45, 66, 78, 89, 99};
        int target = 89;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the mid
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return  -1 ;

    }
}
