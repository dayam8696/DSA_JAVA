package methods_in_java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        int [] arr = {1,45,7,8};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change (int[] num){
        num[0] =99;
    }
}
