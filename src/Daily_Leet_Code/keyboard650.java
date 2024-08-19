package Daily_Leet_Code;

public class keyboard650 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(minSteps(n));
    }
    public static int minSteps(int n) {
        int result = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                result += i;
                n /= i;
            }
        }
        return result;
    }
}
