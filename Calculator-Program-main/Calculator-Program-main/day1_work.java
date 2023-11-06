import java.util.Scanner;

public class day1_work {
    public static void main(String[] args) {

        char operator;
        double a, b, result;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        a = sc.nextDouble();

        System.out.println("Enter second number");
        b = sc.nextDouble();

        System.out.println("Choose an operator: +, -, *,/");
        operator = sc.next().charAt(0);

        switch (operator) {

            case '+':
                result = a + b;
                System.out.println(a + " + " + b + " = " + result);
                break;

            case '-':
                result = a - b;
                System.out.println(a + " - " + b + " = " + result);
                break;

            case '*':
                result = a * b;
                System.out.println(a + " * " + b + " = " + result);
                break;

            case '/':
                result = a / b;
                System.out.println(a + " / " + b + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

    }
}