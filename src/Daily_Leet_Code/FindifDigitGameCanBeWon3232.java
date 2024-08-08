package Daily_Leet_Code;

public class FindifDigitGameCanBeWon3232 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,10};
        System.out.println(canAliceWin(arr));

    }
    public static boolean canAliceWin(int[] nums) {
        int singleDigit = 0;
        int doubleDigit = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<10){
                singleDigit = singleDigit+nums[i];
            }
            else {
                doubleDigit = doubleDigit + nums[i];
            }

        }
        return (singleDigit != doubleDigit) ? true:false;
    }
}
