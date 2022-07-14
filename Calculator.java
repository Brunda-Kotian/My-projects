
import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        double num1, num2;
        char operator;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.println("enter the operator");
        operator = sc.next().charAt(0);
        double o = 0;
        switch (operator) {
            case '+':
                o = num1 + num2;
                break;
            case '-':
                o = num1 * num2;
                break;
            case '*':
                o = num1 * num2;
                break;
            case '/':
                o = num1 / num2;
                break;
            default:
                System.out.println("wrong input");
                break;

        }
        System.out.println("The result is :");
        System.out.println();
        System.out.println(num1 + " " + operator + " " + num2 + " = " + o);

    }

}