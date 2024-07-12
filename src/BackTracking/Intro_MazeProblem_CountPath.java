package BackTracking;

public class Intro_MazeProblem_CountPath {
    public static void main(String[] args) {
        System.out.println(CountPath(3,3));
    }
    static int CountPath(int row ,int col){
        if (row==1 || col==1){
            return 1;
        }

        int left = CountPath(row-1,col);
        int right = CountPath(row ,col-1);

        return left+right;
    }
}
