public class MathUtils {
    // Method for addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method for division with error handling for division by zero
    public static double divide(int a, int b) {
        if (b == 0) {
            return Double.NaN;  // Return Not-a-Number (NaN) when dividing by zero
        }
        return (double) a / b;
    }
}
