package PatternQuestion;

public class Diamond {
    public static void main(String[] args) {
        diamond(5);

    }

    private static void diamond(int n) {
        for (int row = 0 ; row < 2 * n ;row++){
            int colitem = row > n ? 2 * n -row :row;
           int spitem = row > n ? row - n :n-row;
          //  int totalspace = n- colitem;
            for (int sp = 0; sp< spitem; sp++){
                System.out.printf(" ");
            }
            for (int col = 0 ; col<colitem;col++){
                System.out.printf("* ");
            }
            System.out.println();

        }
    }
}

