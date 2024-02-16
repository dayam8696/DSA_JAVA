package Sorting.Cyclic_sort;

public class Leet_code_FindDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,2};
        int ans = findduplicate(arr);
        System.out.println(ans);
    }

    public static int findduplicate(int nums[]){

        int i = 0;
         while (i < nums.length) {

            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i , correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;


    }

    public static void swap (int arr [] , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

