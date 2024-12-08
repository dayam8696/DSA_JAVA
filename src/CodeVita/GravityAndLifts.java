package CodeVita;

import java.util.*;

public class GravityAndLifts {

    public static boolean isStable(int[][] grid, int row, int col, int N) {
        return row == N - 1 || grid[row + 1][col] == 1;
    }

    public static int applyGravity(int[][] grid, int row, int col, int N) {
        while (row < N - 1 && grid[row + 1][col] == 0) {
            row++;
        }
        return row;
    }

    public static int bfs(int[][] grid, int[] start, int[] dest, int N, int M) {
        int sr = start[0];
        int sc = start[1];
        int dr = dest[0];
        int dc = dest[1];

        boolean[][] visited = new boolean[N][M];
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{sr, sc, 0});
        visited[sr][sc] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int moves = current[2];

            row = applyGravity(grid, row, col, N);

            if (row == dr && col == dc) {
                return moves;
            }

            for (int r = row - 1; r >= 0; r--) {
                if (grid[r][col] == 1) {
                    if (!visited[r][col]) {
                        visited[r][col] = true;
                        queue.offer(new int[]{r, col, moves + 1});
                    }
                } else {
                    break;
                }
            }

            if (row == N - 1) {
                if (col - 1 >= 0 && !visited[row][col - 1]) {
                    visited[row][col - 1] = true;
                    queue.offer(new int[]{row, col - 1, moves + 1});
                }
                if (col + 1 < M && !visited[row][col + 1]) {
                    visited[row][col + 1] = true;
                    queue.offer(new int[]{row, col + 1, moves + 1});
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] grid = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int[] start = new int[2];
        start[0] = sc.nextInt();
        start[1] = sc.nextInt();

        int[] dest = new int[2];
        dest[0] = sc.nextInt();
        dest[1] = sc.nextInt();

        if (!isStable(grid, dest[0], dest[1], N)) {
            System.out.println("Impossible");
            return;
        }

        int result = bfs(grid, start, dest, N, M);

        if (result == -1) {
            System.out.println("Impossible");
        } else {
            System.out.println(result);
        }

        sc.close();
    }
}
