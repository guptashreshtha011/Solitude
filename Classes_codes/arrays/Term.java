
import mymath.Mark; 

public class Term {
    public static void main(String[] args) {
        Mark math = new Mark();

        int a = 10, b = 5;

        System.out.println("Addition: " + math.add(a, b));
        System.out.println("Subtraction: " + math.subtract(a, b));
        System.out.println("Multiplication: " + math.multiply(a, b));
        System.out.println("Division: " + math.divide(a, b));
        System.out.println("Factorial of " + a + ": " + math.factorial(a));
    }
}
    