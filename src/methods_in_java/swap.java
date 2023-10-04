package methods_in_java;

public class swap {
    public static void main(String[] args) {
        int a =10;
        int b  = 20;
        swap(a,b);
        System.out.println( a + " " + b);

        String name =  "Dayam Nadeem ";
        changename(name);
        System.out.println(name);

    }

    static void changename(String name){
        name = "Abuzar";
    }

    static  void swap(int a , int b){
        int temp = a ;
        a = b;
        b= a;
    }
}
