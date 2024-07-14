package Daily_Leet_Code;

public class problem1455 {
    public static void main(String[] args) {
        String sentence = "i love eating burger" ;
        String searchwords = "burg";
       // System.out.println(checkPrefix(sentence,searchwords));
        System.out.println(reverse(sentence));
    }
    public static int checkPrefix(String sentence , String searchword){

        String [] sentences = sentence.split(" ");
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].startsWith(searchword)){
                return i +1;
            }
        }
        return -1;
    }

    public static String reverse(String sentence ){

        String [] sentences = sentence.split(" ");
        int start = 0;
        int  end= sentence.length()  ;
        while (start<end){
            swaapping(sentences,start,end);
            start++;
            end--;
        }
        return sentence = String.join(" " , sentence);
    }


    static void swaapping(String []arr ,int index1, int index2){
        String temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;


    }
}
