package Daily_Leet_Code;

public class RemoveDuplicatesfromSortedArray_26 {
    public static void main(String[] args) {
int [] nums = {1,1,2};
        System.out.println(removeDuplicate(nums));
    }

    public static int removeDuplicate(int nums[]){
        if (nums.length == 0) return 0;

        int count = 1; // Start count at 1 because the first element is always unique
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
