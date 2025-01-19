import java.util.Scanner;
public class Calculator {
     // Addition method
     public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction method
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division method
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return Double.NaN; // Not a Number
        }
        return a / b;
    }
    

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        // Call respective method based on operator
        if (operator == '+') {
            result = add(num1, num2);
        } else if (operator == '-') {
            result = subtract(num1, num2);
        } else if (operator == '*') {
            result = multiply(num1, num2);
        } else if (operator == '/') {
            result = divide(num1, num2);
        } else {
            System.out.println("Invalid operator!");
            scanner.close();
            return;
        }

        // Display result
        System.out.println("Result: " + result);
        scanner.close();
    }
}