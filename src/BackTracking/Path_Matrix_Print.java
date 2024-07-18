package BackTracking;

import java.util.Arrays;

public class Path_Matrix_Print {
    public static void main(String[] args) {

        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        allPathsPrint(" ",board,0,0,path,1);


    }
    static void allPathsPrint(String p, boolean[][] maze, int r, int c , int [] [] path , int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] =step;
            for (int [] arr :path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }
        maze[r][c] =false;
        path[r][c] =step;

        if (r < maze.length - 1) {
            allPathsPrint(p + 'D', maze, r+1, c ,path,step+1);
        }

        if (c < maze[0].length - 1) {
            allPathsPrint(p + 'R', maze, r, c+1 ,path ,step+1);
        }
        if (r>0) {
            allPathsPrint(p + 'U', maze, r-1, c , path ,step+1);
        }
        if (c>0) {
            allPathsPrint(p + 'L', maze, r, c-1 , path , step+1);
        }
        maze[r][c]=true;
        path[r][c] =0;
    }
}
