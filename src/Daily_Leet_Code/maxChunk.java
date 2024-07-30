package Daily_Leet_Code;

public class maxChunk {
    public static void main(String[] args) {
            int [] arr = {1,0,2,3,4};
        System.out.println(MaXCHUNK(arr));
    }
    public static int MaXCHUNK(int [] arr){
        int max_val = 0;
        int chunks = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max_val){
                max_val = arr[i];
            }
            if (max_val==i){
                chunks++;
            }
        }
        return chunks;
    }
}
