package switch_case;

import conditional_and_loops.if_else_questions.CaseCheck;

import java.util.Scanner;

public class nested_switch_case {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int empId= in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1 -> System.out.println("Dayam Nadeem");
            case 2 -> System.out.println("Abuzar");
            case 3 -> {
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Invalid department");
                        break;
                }
            }
            default -> System.out.println("invalid employee id");
        }
    }
}
