package PatternQuestion;

public class Pattern5 {
    public static void main(String[] args) {

pattern1(4);
pattern2(4);
    }


    private static void pattern1(int n){
        for (int row = 1; row<=n;row++){
            for (int sp = 1 ; sp<=n-row;sp++){
                System.out.printf(" ");
            }
            for (int col = 1 ; col<=row ;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n){
        for (int row = 1; row<=n;row++){
            for (int sp = 1 ; sp<=n-row;sp++){
                System.out.printf(" ");
            }
            for (int col = 1 ; col<=row ;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    }

