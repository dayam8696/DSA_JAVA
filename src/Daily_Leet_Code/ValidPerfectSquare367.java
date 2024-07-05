package Daily_Leet_Code;

public class ValidPerfectSquare367 {
    public static void main(String[] args) {
        System.out.println(perfectSquare(4));
    }
    static boolean perfectSquare(int num){
        if (num==1){
            return true;
        }
        for (int i = 1; i <= num/2; i++) {
            if (i*i == num){
                return true;
            }

        }
        return false;
    }
}
