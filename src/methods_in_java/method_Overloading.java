package methods_in_java;

public class method_Overloading {
    public static void main(String[] args) {
     fun(56);
     fun("dayam");
    }

    static void fun(int a ){
        System.out.println(a);
    }

    static void fun(String b){
        System.out.println(b);
    }
}
