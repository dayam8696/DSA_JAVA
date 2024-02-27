package PatternQuestion;

public class Pattern3 {
    public static void main(String[] args) {
        for (int row= 1 ; row<=4;row++){
            for (int col = 1 ;col<=4-row+1;col++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
