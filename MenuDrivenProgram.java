import java.util.Scanner;
public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("*******Menu*******");
            System.out.print("1. Find Largest Number");
            System.out.print("\n2. Exit\n");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter the number of elements: ");
                int n = scanner.nextInt();
                System.out.print("Enter a number: ");
                int largest = scanner.nextInt();
                for (int i = 1; i < n; i++) {
                    System.out.print("Enter a number: ");
                    int num = scanner.nextInt();
                    if (num > largest) {
                        largest = num;
                    }
                    }
                System.out.println("The largest number is: " + largest);
            } else if (choice != 2) {
                System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 2);
        System.out.println("Exiting...");
        scanner.close();
    }
}