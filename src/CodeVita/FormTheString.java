package CodeVita;

import java.util.*;

public class FormTheString {

    public static int findMinCost(int n, String[][] substrings, String mainString) {
        int mainLength = mainString.length();
        int[] dp = new int[mainLength + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= mainLength; i++) {
            for (String[] substring : substrings) {
                String subStr = substring[0];
                int cost = Integer.parseInt(substring[1]);
                int subLen = subStr.length();

                if (i >= subLen && mainString.substring(i - subLen, i).equals(subStr)) {
                    if (dp[i - subLen] != Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i], dp[i - subLen] + cost);
                    }
                }
            }
        }

        return dp[mainLength] == Integer.MAX_VALUE ? -1 : dp[mainLength];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[][] substrings = new String[n][2];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            substrings[i][0] = input[0];
            substrings[i][1] = input[1];
        }

        String mainString = scanner.nextLine();

        int result = findMinCost(n, substrings, mainString);

        if (result == -1) {
            System.out.print("Impossible");
        } else {
            System.out.print(result);
        }
    }
}

