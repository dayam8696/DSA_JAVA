package Daily_Leet_Code;

public class FinalValueofVariableAfterPerformingOperations2011 {
    public static void main(String[] args) {
        String [] oprations1 = {"--X","X++","X++"};
        String [] oprations2 = {"++X","++X","X++"};
        System.out.println(finalValueAfterOperations(oprations1));

    }
    public static int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("--X") || operations[i].equals("X--")){
                count = count-1;

            } else if (operations[i].equals("++X") || operations[i].equals("X++")) {
                count=count+1;
            }
        }
        return count;
    }
}
