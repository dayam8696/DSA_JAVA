package PatternQuestion;

public class Pattern3 {
    public static void main(String[] args) {
        for (int row= 1 ; row<=5;row++){
            for (int col = 1 ;col<=5-row+1;col++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
