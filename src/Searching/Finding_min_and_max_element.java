package Searching;

public class Finding_min_and_max_element {
    public static void main(String[] args) {
     int[] arr = {33,45,2,-7,9,11,6};
     int ans = minimum_element(arr);
        System.out.println(ans);
        int ans2 = max(arr);
        System.out.println(ans2);

    }
    static int minimum_element(int[] arr){
        int min = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if (arr[i] < min){
                min=arr[i];

            }

        }
        return min;
    }

    static int max(int arr[]){
        int maxval = arr[0];
        for (int i = 1 ;i<arr.length ;i++){
            if(arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
