public class BugSolution {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        try {
            int z = x / y;
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
            // Handle the exception appropriately, e.g., log the error, display a user-friendly message, or use a default value
        }
    }
}