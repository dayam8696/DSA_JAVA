package String;

public class string_palindrome {
    public static void main(String[] args) {
        String [] dym = {"a" ,"b" ,"c","d","c","b","a"};
        System.out.println(checkpalindrome(dym));;
    }

    private static boolean checkpalindrome(String[] args) {
        int start = 0;
        int end = args.length-1;

        while (start<end){
            if (args[start]==args[end]){
               return true;

            }
            start ++;
            end--;
            }



return false;
    }
    }

