package Daily_Leet_Code;

public class PowerofTwo231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(2));
    }
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
