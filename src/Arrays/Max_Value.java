package Arrays;

public class Max_Value {
    public static void main(String[] args) {
        int [] arr = { 2,45, 67,9};
        int ans = max(arr);
        System.out.println(ans);

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
