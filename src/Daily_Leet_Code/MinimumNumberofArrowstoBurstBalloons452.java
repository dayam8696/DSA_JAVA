package Daily_Leet_Code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimumNumberofArrowstoBurstBalloons452 {
    public static void main(String[] args) {
            int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(points));
    }

    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)-> Integer.compare(a[1],b[1]));
        int arrow = 1 ,end = points[0][1];

        for (int i = 0; i < points.length; i++) {
            if (points[i][0]>end){
                arrow++;
                end = points[i][1];
            }
            
        }
        return arrow;
    }
}

