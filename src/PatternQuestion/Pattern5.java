package PatternQuestion;

public class Pattern5 {
    public static void main(String[] args) {
        for (int row = 1; row<=4;row++){
            for (int sp = 1 ; sp<=4-row;sp++){
                System.out.printf(" ");
            }
            for (int col = 1 ; col<=row ;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }

