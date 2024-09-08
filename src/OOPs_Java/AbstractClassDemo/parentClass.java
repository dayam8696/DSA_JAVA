package OOPs_Java.AbstractClassDemo;

public abstract class parentClass {
    int age;


    public parentClass(int age) {
        this.age = age;

    }

    static void hello(){
        System.out.println("hey");
    }

    void normal() {
        System.out.println("this is a normal method");
    }

    abstract void career();
    abstract void partner();
}
