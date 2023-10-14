package Searching;

public class Search_In_Range {
    public static void main(String[] args) {
        int[] arr = {2, 3, 66, 34, 99};
        int ans = Linear_Search(arr, 34);
        System.out.println("Element found at Index no : " + ans);
    }


    static int Linear_Search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // searching element
        //searching in range
        for (int index = 2; index < 5; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }

        }
        // if element not found in Array
        return -1;
    }
}
