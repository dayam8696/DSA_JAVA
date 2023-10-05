package methods_in_java;

import java.util.Arrays;

public class VarAgs {
    public static void main(String[] args) {
            fun(3,4,56,8,6,33,4,56,9);
            multiple(20,40,"dayam" , "abuzar", "danish");
    }

    // multiple arguments
    static void multiple(int a , int b , String...v){
        System.out.println(v);
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
