package Daily_Leet_Code;

public class UglyNumberII264 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(nthUglyNumber(n));
    }
    public static int nthUglyNumber(int n) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;

        int i2 = 0, i3 = 0, i5 = 0;
        int next_2 = 2, next_3 = 3, next_5 = 5;

        for (int i = 1; i < n; i++) {
            int nextUgly = Math.min(next_2, Math.min(next_3, next_5));
            uglyNumbers[i] = nextUgly;

            if (nextUgly == next_2) {
                i2++;
                next_2 = uglyNumbers[i2] * 2;
            }
            if (nextUgly == next_3) {
                i3++;
                next_3 = uglyNumbers[i3] * 3;
            }
            if (nextUgly == next_5) {
                i5++;
                next_5 = uglyNumbers[i5] * 5;
            }
        }

        return uglyNumbers[n - 1];
    }
}
