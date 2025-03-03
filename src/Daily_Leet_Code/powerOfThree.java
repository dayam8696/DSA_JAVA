package Daily_Leet_Code;

public class powerOfThree {
    public  static boolean isPowerOfThree(int n) {
        int ans = 0;
        while(n>=3){
            n = n/3;

        }
        if(n!= 1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 27;
        System.out.println(isPowerOfThree(n));
    }
}

