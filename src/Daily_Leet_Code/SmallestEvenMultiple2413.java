package Daily_Leet_Code;

public class SmallestEvenMultiple2413 {
    public static void main(String[] args) {
int n =5 ;
        System.out.println(smallestEvenMultiple(5));
    }
    public static int smallestEvenMultiple(int n) {
        if(n%2==0){
            return n;
        }
        else return n*2;
    }
}
