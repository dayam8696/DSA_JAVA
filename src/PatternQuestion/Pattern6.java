package PatternQuestion;

public class Pattern6 {
    public static void main(String[] args) {

        patter6(4);
    }

    private static void patter6(int n) {
        for (int row = 0; row < 2 * n ; row++){
            int totalCoulum = row > n ? 2 * n -row : row;
            for (int col = 0; col < totalCoulum; col++ ){
                System.out.printf("* ");
            }
            System.out.println();
        }

    }
}
