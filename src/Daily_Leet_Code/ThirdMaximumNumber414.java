package Daily_Leet_Code;

public class ThirdMaximumNumber414 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums){
        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for (Integer num : nums) {
            if (num.equals(firstMax) || num.equals(secondMax) || num.equals(thirdMax)) continue;

            if (firstMax == null || num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }

        return (thirdMax == null) ? firstMax : thirdMax;
    }
    }

