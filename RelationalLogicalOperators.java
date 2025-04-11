import java.util.Scanner;

public class RelationalLogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for relational operators
        System.out.println("Enter first number:");
        double a = scanner.nextDouble();
        System.out.println("Enter second number:");
        double b = scanner.nextDouble();
        System.out.println("Enter third number:");
        double c = scanner.nextDouble();

        // Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));  
        System.out.println("a >= c: " + (a >= c));
        System.out.println("a <= c: " + (a <= c));

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));        
        System.out.println("!y: " + (!y));
        System.out.println("x && !y: " + (x && !y));

        scanner.close();
    }
}