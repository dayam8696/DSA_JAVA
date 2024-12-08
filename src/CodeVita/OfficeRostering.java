package CodeVita;
import java.util.*;

public class OfficeRostering {

    public static int[] simulateDay(List<List<Integer>> friends, int[] todayStatus) {
        int n = todayStatus.length;
        int[] nextStatus = new int[n];

        for (int d = 0; d < n; d++) {
            int wfoFriends = 0;
            for (int friendID : friends.get(d)) {
                if (todayStatus[friendID] == 1) {
                    wfoFriends++;
                }
            }
            if (todayStatus[d] == 1 && wfoFriends == 3) {
                nextStatus[d] = 1;
            } else if (todayStatus[d] == 0 && wfoFriends < 3) {
                nextStatus[d] = 1;
            } else {
                nextStatus[d] = 0;
            }
        }
        return nextStatus;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            if (n <= 3 || n > 30 || m < 1 || m > 30) {
                System.out.println(-1);
                return;
            }

            List<List<Integer>> friends = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                friends.add(new ArrayList<>());
            }

            for (int i = 0; i < m; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                friends.get(a).add(b);
                friends.get(b).add(a);
            }

            int k = scanner.nextInt();
            if (k < 1 || k > 50) {
                System.out.println(-1);
                return;
            }

            int[] currentStatus = new int[n];
            Arrays.fill(currentStatus, 1);

            int rosterValue = n;
            int days = 1;

            while (rosterValue < k) {
                int[] nextStatus = simulateDay(friends, currentStatus);

                int todayWFO = 0;
                for (int status : nextStatus) {
                    todayWFO += status;
                }

                if (todayWFO == 0) {
                    System.out.println(-1);
                    return;
                }

                rosterValue += todayWFO;
                currentStatus = nextStatus;
                days++;
            }

            System.out.println(days);
        } catch (Exception e) {
            System.out.println(-1);
        } finally {
            scanner.close();
        }
    }
}

