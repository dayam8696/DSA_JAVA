package Searching;

public class Search_In_String {
    public static void main(String[] args) {
        String str = "Dayam";
        char target = 'm';
        System.out.println(search(str ,target));


    }

    static boolean search(String str , char target){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            int element = str.charAt(i);
            if (element==target){
                return true;
            }
        }
        return false;
    }
}
