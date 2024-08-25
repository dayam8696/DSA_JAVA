package OOPs_Java.statice_example;

public class Human {
    int age;
    String name;
    int salary;
    boolean married ;
   static long poppulation ;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.poppulation +=1;
    }
}
