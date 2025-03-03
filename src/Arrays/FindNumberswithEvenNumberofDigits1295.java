package Arrays;

public  class FindNumberswithEvenNumberofDigits1295 {

    public static int findNumbers(int[] nums) {
        int ans = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            while (temp != 0) {

                temp = temp / 10;
                count++;
            }
            if (count % 2 == 0) {
                ans++;

                }
            count = 0;
            }
        return ans;
        }



    public static void main(String[] args) {
        int[] nums = {437,315,322,431,686,264,442};
        System.out.println(findNumbers(nums));
    }
}


