public class hexaview {
    public static void main(String[] args) {
            int n = 121;
            int original = n;
            int ans = 0;
            while(n>0){
                int res = n%10;
                n= n/10;
                ans = ans*10+res;

            }
            if(ans==original){
                System.out.println("its plaindrom number");
            }
            else {
                System.out.println("its not");
            }
        }
    }

