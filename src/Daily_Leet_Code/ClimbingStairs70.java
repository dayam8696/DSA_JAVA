package Daily_Leet_Code;

public class ClimbingStairs70 {
    public static void main(String[] args) {
        System.out.println(CountStairs(5));
    }
    public static int CountStairs(int n){
        if (n<=3){
            return n;
        }
        int a = 3 ,b=2;

        for (int i = 0; i < n-3; i++) {
            a=a+b;
            b=a-b;
        }
        return a;
    }
}
