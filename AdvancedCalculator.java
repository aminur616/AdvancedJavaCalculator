import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Advanced Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power (x^y)");
            System.out.println("6. Square Root");
            System.out.println("7. Sine");
            System.out.println("8. Cosine");
            System.out.println("9. Tangent");
            System.out.println("10. Log (base 10)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            double a, b, result;

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    a = input.nextDouble();
                    b = input.nextDouble();
                    System.out.println("Result: " + (a + b));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    a = input.nextDouble();
                    b = input.nextDouble();
                    System.out.println("Result: " + (a - b));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    a = input.nextDouble();
                    b = input.nextDouble();
                    System.out.println("Result: " + (a * b));
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    a = input.nextDouble();
                    b = input.nextDouble();
                    if (b == 0) {
                        System.out.println("Error: Division by zero!");
                    } else {
                        System.out.println("Result: " + (a / b));
                    }
                    break;

                case 5:
                    System.out.print("Enter base and exponent: ");
                    a = input.nextDouble();
                    b = input.nextDouble();
                    System.out.println("Result: " + Math.pow(a, b));
                    break;

                case 6:
                    System.out.print("Enter a number: ");
                    a = input.nextDouble();
                    if (a < 0) {
                        System.out.println("Error: Negative number");
                    } else {
                        System.out.println("Result: " + Math.sqrt(a));
                    }
                    break;

                case 7:
                    System.out.print("Enter angle in degrees: ");
                    a = Math.toRadians(input.nextDouble());
                    System.out.println("sin: " + Math.sin(a));
                    break;

                case 8:
                    System.out.print("Enter angle in degrees: ");
                    a = Math.toRadians(input.nextDouble());
                    System.out.println("cos: " + Math.cos(a));
                    break;

                case 9:
                    System.out.print("Enter angle in degrees: ");
                    a = Math.toRadians(input.nextDouble());
                    System.out.println("tan: " + Math.tan(a));
                    break;

                case 10:
                    System.out.print("Enter a positive number: ");
                    a = input.nextDouble();
                    if (a <= 0) {
                        System.out.println("Error: Log undefined for ≤ 0");
                    } else {
                        System.out.println("Result: " + Math.log10(a));
                    }
                    break;

                case 0:
                    System.out.println("Exiting Calculator. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        input.close();
    }
}


