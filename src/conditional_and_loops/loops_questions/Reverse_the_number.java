package conditional_and_loops.loops_questions;

public class Reverse_the_number {
    //Q - Reverse the given number
    public static void main(String[] args) {
        int n = 12345;
        int ans = 0;
        while(n>0){
        int rem = n%10;
        n= n/10;
        ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
