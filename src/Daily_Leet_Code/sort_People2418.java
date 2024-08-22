package Daily_Leet_Code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sort_People2418 {
    public static void main(String[] args) {
        String[] names1 = {"Mary", "John", "Emma"};
        int[] heights1 = {180, 165, 170};
        System.out.println(Arrays.toString(sortPeople(names1,heights1)));

    }
    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer ,String>  map = new HashMap<>();
        int n = names.length;
        Map<Integer, String> heightToNameMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            heightToNameMap.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            result[i] = heightToNameMap.get(heights[n - 1 - i]);
        }

        return result;
    }
}
