package Daily_Leet_Code;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies1431 {
    public static void main(String[] args) {
        int arr [] = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(arr,extraCandies));

    }
    public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]>max){
                max = candies[i];
            }

        }
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max){
                result.add(true);
            }
            else {
                result.add(false);
            }

        }
        return result;
    }
}
