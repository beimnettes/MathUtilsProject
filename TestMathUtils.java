public class TestMathUtils {
    public static void main(String[] args) {
        // Testing addition
        System.out.println("Addition of 5 and 3: " + MathUtils.add(5, 3));

        // Testing subtraction
        System.out.println("Subtraction of 5 and 3: " + MathUtils.subtract(5, 3));

        // Testing multiplication
        System.out.println("Multiplication of 5 and 3: " + MathUtils.multiply(5, 3));

        // Testing division
        System.out.println("Division of 6 by 3: " + MathUtils.divide(6, 3));
        
        // Testing division by zero (edge case)
        System.out.println("Division of 6 by 0: " + MathUtils.divide(6, 0));
    }
}
