package methods_in_java;

public class String_Example {
    public static void main(String[] args) {
        String msg2 = myGreet("Dayam Nadeem ");
        System.out.println(msg2);
        String msg = greet();
        System.out.println(msg);

       
    }

   static String myGreet(String name ) {
        String message = "Hello "+name;
        return message;
    }

    static String greet(){
        String greeting = "how are you ";
        return greeting;
    }
}
