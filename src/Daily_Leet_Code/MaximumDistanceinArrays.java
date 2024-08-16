package Daily_Leet_Code;

import java.util.List;
import java.util.Arrays;

public class MaximumDistanceinArrays {
    public static void main(String[] args) {
        List<List<Integer>> arrays1 = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(1, 2, 3)
        );
        System.out.println(maxDistance(arrays1));
    }
    public static int maxDistance(List<List<Integer>> arrays) {
        int maxDistance = 0;
        int minVal = arrays.get(0).get(0);
        int maxVal = arrays.get(0).get(arrays.get(0).size() - 1);

        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> currentArray = arrays.get(i);


            int dist1 = Math.abs(currentArray.get(currentArray.size() - 1) - minVal);
            int dist2 = Math.abs(maxVal - currentArray.get(0));


            maxDistance = Math.max(maxDistance, Math.max(dist1, dist2));


            minVal = Math.min(minVal, currentArray.get(0));
            maxVal = Math.max(maxVal, currentArray.get(currentArray.size() - 1));
        }

        return maxDistance;
    }

}
