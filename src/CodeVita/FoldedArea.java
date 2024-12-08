package CodeVita;

import java.util.*;
import java.text.DecimalFormat;

class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Point rotate(double theta) {
        double rad = Math.toRadians(theta);
        double newX = x * Math.cos(rad) - y * Math.sin(rad);
        double newY = x * Math.sin(rad) + y * Math.cos(rad);
        return new Point(newX, newY);
    }
}

public class FoldedArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("0 0");
            return;
        }

        List<Point> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            points.add(new Point(x, y));
        }

        double minArea = Double.MAX_VALUE;
        double bestWidth = 0, bestHeight = 0;

        for (int angle = 0; angle < 180; angle++) {
            double width = 0, height = 0;
            double minX = Double.MAX_VALUE, maxX = -Double.MAX_VALUE;
            double minY = Double.MAX_VALUE, maxY = -Double.MAX_VALUE;

            for (Point p : points) {
                Point rotated = p.rotate(angle);
                minX = Math.min(minX, rotated.x);
                maxX = Math.max(maxX, rotated.x);
                minY = Math.min(minY, rotated.y);
                maxY = Math.max(maxY, rotated.y);
            }

            width = maxX - minX;
            height = maxY - minY;
            double area = width * height;

            if (area < minArea) {
                minArea = area;
                bestWidth = width;
                bestHeight = height;
            }
        }

        if (bestWidth > bestHeight) {
            double temp = bestWidth;
            bestWidth = bestHeight;
            bestHeight = temp;
        }

        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format(bestWidth) + " " + df.format(bestHeight));

        sc.close();
    }
}
