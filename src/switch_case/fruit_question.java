package switch_case;

import java.util.Scanner;

public class fruit_question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the fruit name");
        String fruit = in.next();
        switch (fruit) {
            case "apple" -> System.out.println("sweet red fruit");
            case "mango" -> System.out.println("King of fruits");
            case "orange" -> System.out.println("Round Fruit");
            case "Graps" -> System.out.println("Green Fruits");
            default -> System.out.println("please enter the valid fruit name ");
        }
    }
}
