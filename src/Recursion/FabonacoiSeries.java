package Recursion;

public class FabonacoiSeries {
    public static void main(String[] args) {
        int ans = 30;
        System.out.println(fiboformula(ans));
    }


    static int fiboformula(int n){
        return (int) (Math.pow(((1+ Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }
    static int fibo(int n){
        // base condition
        if (n <2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
