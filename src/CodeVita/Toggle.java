package CodeVita;

import java.util.*;

public class Toggle {

    public static List<Integer> getPossibleDigits(Map<Integer, String> validDigits, String fd) {
        List<Integer> potd = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : validDigits.entrySet()) {
            int mismatches = 0;
            String pattern = entry.getValue();
            for (int d = 0; d < fd.length(); d++) {
                if (fd.charAt(d) != pattern.charAt(d)) {
                    mismatches++;
                    if (mismatches > 1) break;
                }
            }
            if (mismatches <= 1) {
                potd.add(entry.getKey());
            }
        }
        return potd;
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);

        String[] segd = new String[3];
        for (int d = 0; d < 3; d++) {
            segd[d] = scanner.nextLine().strip();
        }

        String[] placementlelo = new String[3];
        for (int d = 0; d < 3; d++) {
            placementlelo[d] = scanner.nextLine().strip();
        }

        Map<Integer, String> digp = new HashMap<>();
        for (int digit = 0; digit < 10; digit++) {
            StringBuilder pattern = new StringBuilder();
            for (int row = 0; row < 3; row++) {
                pattern.append(segd[row].substring(digit * 3, (digit + 1) * 3));
            }
            digp.put(digit, pattern.toString());
        }

        List<List<Integer>> possibleNumbers = new ArrayList<>();
        int width = placementlelo[0].length() / 3;

        for (int d = 0; d < width; d++) {
            StringBuilder fd = new StringBuilder();
            for (int row = 0; row < 3; row++) {
                fd.append(placementlelo[row].substring(d * 3, (d + 1) * 3));
            }
            List<Integer> matchingDigits = getPossibleDigits(digp, fd.toString());
            if (matchingDigits.isEmpty()) {
                System.out.print("Invalid");
                return;
            }
            possibleNumbers.add(matchingDigits);
        }

        int totalSum = 0;
        for (int[] combination : generateCombinations(possibleNumbers)) {
            StringBuilder number = new StringBuilder();
            for (int digit : combination) {
                number.append(digit);
            }
            totalSum += Integer.parseInt(number.toString());
        }

        System.out.print(totalSum);
    }

    public static List<int[]> generateCombinations(List<List<Integer>> possibleNumbers) {
        List<int[]> result = new ArrayList<>();
        int[] indices = new int[possibleNumbers.size()];
        int[] maxIndices = new int[possibleNumbers.size()];

        for (int d = 0; d < possibleNumbers.size(); d++) {
            maxIndices[d] = possibleNumbers.get(d).size();
        }

        while (true) {
            int[] combination = new int[possibleNumbers.size()];
            for (int d = 0; d < indices.length; d++) {
                combination[d] = possibleNumbers.get(d).get(indices[d]);
            }
            result.add(combination);

            int position = indices.length - 1;
            while (position >= 0 && indices[position] + 1 >= maxIndices[position]) {
                indices[position] = 0;
                position--;
            }
            if (position < 0) break;
            indices[position]++;
        }

        return result;
    }

    public static void main(String[] args) {
        solve();
    }
}
