package PatternQuestion;

public class Pattern4 {
    public static void main(String[] args) {
        for (int row= 1 ; row<=4;row++){
            for (int col = 1 ;col<=row;col++){
                System.out.printf(col+" ");
            }
            System.out.println();
        }

        for (int row= 1 ; row<=4;row++){
            for (int col = 1 ;col<=4-row+2;col++){
                System.out.printf(col+" ");
            }
            System.out.println();
        }
    }
}
