package Daily_Leet_Code;

public class FindtheWinningPlayerinCoinGame3222 {
    public static void main(String[] args) {
        System.out.println(findWinner(2, 7));
    }
    public static String findWinner(int x, int y) {

        int maxMoves = Math.min(x, y / 4);


        int coins75PerMove = 1;
        int coins10PerMove = 4;


        int totalCoins75Needed = maxMoves * coins75PerMove;
        int totalCoins10Needed = maxMoves * coins10PerMove;


        if (totalCoins75Needed <= x && totalCoins10Needed <= y) {

            int totalMoves = maxMoves;


            if (totalMoves % 2 == 1) {
                return "Alice";
            } else {
                return "Bob";
            }
        } else {

            return "Bob";
        }
    }
}
