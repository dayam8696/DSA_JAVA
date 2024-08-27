package OOPs_Java.statice_example;

public class StaticBlock {
    static int a = 4;
    static int b ;
    // will only run once, when the first obj is create i.e. when the class is loaded for the first time
    static {
        System.out.println("I am static");
        b= a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a+ " " + StaticBlock.b);
        StaticBlock.b += 3;
        System.out.println(StaticBlock.b);
    }

}
