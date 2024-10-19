import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter command (or 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];

            try {
                switch (command) {
                    case "add":
                        System.out.println(calculator.add(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
                        break;
                    case "subtract":
                        System.out.println(calculator.subtract(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
                        break;
                    case "multiply":
                        System.out.println(calculator.multiply(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
                        break;
                    case "divide":
                        System.out.println(calculator.divide(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
                        break;
                    case "fibonacciNumberFinder":
                        System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(parts[1])));
                        break;
                    case "intToBinaryNumber":
                        System.out.println(calculator.intToBinaryNumber(Integer.parseInt(parts[1])));
                        break;
                    default:
                        System.out.println("Unknown command. Available commands: add, subtract, multiply, divide, fibonacciNumberFinder, intToBinaryNumber");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please enter integers.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid number of arguments. Please check your input.");
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic error: " + e.getMessage());
            }
        }

        scanner.close();
        System.out.println("Program terminated.");
    }
}