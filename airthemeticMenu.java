import java.util.Scanner;

public class airthemeticMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice; 
        do {
            System.out.println("Menu");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.println("Enter your choice:");

            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 5) {
                System.out.println("Enter first number:");
                double x = scanner.nextDouble();
                System.out.println("Enter second number:");
                double y = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Sum is " + (x + y));
                        break;
                    case 2:
                        System.out.println("Difference is " + (x - y));
                        break;
                    case 3:
                        System.out.println("Product is " + (x * y));
                        break;
                    case 4:
                        System.out.println("Division is " + (x / y));
                        break;
                    case 5:
                        System.out.println("Modulus is " + (x % y));
                        break;
                }
            } else if (choice == 6) {
                System.out.println("Exiting...");
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
         while (choice != 6);
        scanner.close();
    }
}