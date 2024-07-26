package Daily_Leet_Code;

public class CountofMatchesinTournament1688 {
    public static void main(String[] args) {
        System.out.println(countMatches(7));
    }
    public static int countMatches(int n) {
        int totalMatches = 0;

        while (n > 1) {
            if (n % 2 == 0) {
                // If the number of teams is even
                totalMatches += n / 2;
                n = n / 2;
            } else {
                // If the number of teams is odd
                totalMatches += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }

        return totalMatches;
    }
}
