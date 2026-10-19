import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("-----------------");

        // Input first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Input second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Input operation
        System.out.print("Enter an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;

        // Perform calculation based on operation
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.printf("Result: %.2f + %.2f = %.2f%n", num1, num2, result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("Result: %.2f - %.2f = %.2f%n", num1, num2, result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("Result: %.2f * %.2f = %.2f%n", num1, num2, result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.printf("Result: %.2f / %.2f = %.2f%n", num1, num2, result);
                }
                break;
            default:
                System.out.println("Invalid operation. Please use +, -, *, or /.");
        }

        scanner.close();
    }
}
