package Daily_Leet_Code;

import java.util.HashSet;
import java.util.Set;

public class CounttheNumberofConsistentStrings1684 {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        System.out.println(countConsistentStrings(allowed, words));

    }

    public static int countConsistentStrings(String allowed, String[] words) {

        HashSet<Character> allowedSet = new HashSet<>();
        for (char ch : allowed.toCharArray()) {
            allowedSet.add(ch);
        }

        int consistentCount = 0;


        for (String word : words) {
            boolean isConsistent = true;


            for (char ch : word.toCharArray()) {
                if (!allowedSet.contains(ch)) {
                    isConsistent = false;
                    break;
                }
            }


            if (isConsistent) {
                consistentCount++;
            }
        }

        return consistentCount;
    }

}

