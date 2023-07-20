import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class CalculatorApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new BasicCalculator();

        while (true) {
            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();

            System.out.println("Select operation (1:Addition,2:Subtraction,3:Multiplication,4:Division):");
            int operator = scanner.nextInt();

            double result = 0;
            switch (operator){
                case 1:
                    result = calculator.add(num1, num2);
                    break;
                case 2:
                    result = calculator.subtract(num1, num2);
                    break;
                case 3:
                    result = calculator.multiply(num1, num2);
                    break;
                case 4:
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator");
                    continue;
            }

            System.out.println("Result: " + result);
            System.out.println("Do you want to perform another calculation? (y/n)");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("n")) {
                break;
            }
        }

        scanner.close();
    }
}
