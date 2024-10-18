import java.util.UUID;

class Calculator {

    Calculator() {
        // Empty constructor
    }

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    int fibonacciNumberFinder(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }

        int prev = 1, curr = 1;
        for (int i = 3; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    String intToBinaryNumber(int number) {
        if (number == 0) {
            return "0";
        }
        return Integer.toBinaryString(number);
    }

    String createUniqueID(String n) {
        return n + UUID.randomUUID().toString();
    }
}