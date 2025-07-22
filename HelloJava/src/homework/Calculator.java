package homework;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] command = in.nextLine().split(" ");
        double operand1 = Double.parseDouble(command[0]);
        double operand2 = Double.parseDouble(command[2]);
        String operation = command[1];
        double result   ;

        switch (operation) {

            case "+":
                result = operand1 + operand2;
                break;

            case "-":
                result = operand1 - operand2;
                break;

            case "*":
                result = operand1 * operand2;
                break;

            case "/":
                result = operand1 / operand2;
                break;

            default:
                System.out.println("Некорректная операция");
                return;

        }

        System.out.printf("%.2f %s %.2f = %.2f\n", operand1, operation, operand2, result);


    }

}
