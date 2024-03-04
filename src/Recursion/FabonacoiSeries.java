package Recursion;

public class FabonacoiSeries {
    public static void main(String[] args) {
        int ans = 4;
        System.out.println(fibo(ans));
    }

    static int fibo(int n){
        // base condition
        if (n <2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
