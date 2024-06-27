package Recursion_Level_1;

public class N_to_1 {
    public static void main(String[] args) {
            fun(10);
    }
   static void fun (int n ){
        if(n==0){
            return;
        }
        // 5-4-3-2-1
       //System.out.println(n);
        fun(n-1);
        //1-2-3-4-5
       System.out.println(n);
   }
}
