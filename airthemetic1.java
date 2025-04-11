import java.util.Scanner;

public class airthemetic1 {
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
            System.out.println("6. Increment");
            System.out.println("7. Decrement");
            System.out.println("8. Exit");
            System.out.println("Enter your choice:");

            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 5) {
                System.out.println("Enter the number of inputs:");
                int n = scanner.nextInt();
                double result = 0;
                if (choice == 1 || choice == 3) {
                    result = (choice == 1) ? 0 : 1;
                } else {
                    System.out.println("Enter first number:");
                    result = scanner.nextDouble();
                    n--;
                }
                for (int i = 0; i < n; i++) {
                    System.out.println("Enter number " + (i + 1) + ":");
                    double num = scanner.nextDouble();
                    switch (choice) {
                        case 1:
                            result += num;
                            break;
                        case 2:
                            result -= num;
                            break;
                        case 3:
                            result *= num;
                            break;
                        case 4:
                            result /=num;
                            break;
                        case 5:
                            result %= num;
                            break;
                    }
                }
                if (!Double.isNaN(result)) {
                    switch (choice) {
                        case 1:
                            System.out.println("Total sum is " + result);
                            break;
                        case 2:
                            System.out.println("Total difference is " + result);
                            break;
                        case 3:
                            System.out.println("Total product is " + result);
                            break;

                    }
                }
            }else if (choice==4){
                System.out.println("enter a number to division");
                double num = scanner.nextDouble();
                System.out.println("Total division result is " + num);
            }
            else if (choice ==5){
                System.out.println("enter a number to modulus");
                double num = scanner.nextDouble();
                System.out.println("Total modulus result is " + num);
            }    
            else if (choice == 6) {
                System.out.println("Enter a number to increment:");
                double num = scanner.nextDouble();
                System.out.println("Incremented value is " + (++num));
            } else if (choice == 7) {
                System.out.println("Enter a number to decrement:");
                double num = scanner.nextDouble();
                System.out.println("Decremented value is " + (--num));
            } else if (choice == 8) {
                System.out.println("Exiting...");
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }
        } while (choice != 8);
        scanner.close();
    }
}