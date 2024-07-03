package Daily_Leet_Code;

public class RemoveElement27 {
    public static void main(String[] args) {
        int [] arr = {3,2,2,3};
        System.out.println(RemoveElemnet(arr,3));
    }

    static int RemoveElemnet(int nums[] , int val){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                nums[count] = nums[i];
                count++;
            }

        }
        return count;
    }
}
