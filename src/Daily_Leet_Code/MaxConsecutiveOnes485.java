package Daily_Leet_Code;

public class MaxConsecutiveOnes485 {
    public static void main(String[] args) {
        int [] arr = { 1,1,0,1,1,1};
        System.out.println(MaxCon(arr));
    }
    static int MaxCon(int [] arr){
        int count = 0;
        int max_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1){
                count++;
                max_count = Math.max(max_count,count);
            }

            else {
                count = 0;
            }

        }
        return max_count;
    }
}
