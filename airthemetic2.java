import java.util.Scanner;

public class airthemetic2 {
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
                System.out.println("Enter the number of inputs:");
                int n = scanner.nextInt();
                double[] numbers = new double[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("Enter number " + (i + 1) + ":");
                    numbers[i] = scanner.nextDouble();
                }

                switch (choice) {
                    case 1:
                        double sum = 0;
                        for (double num : numbers) {
                            sum += num;
                        }
                        System.out.println("Total sum is " + sum);
                        break;
                    case 2:
                        double difference = numbers[0];
                        for (int i = 1; i < n; i++) {
                            difference -= numbers[i];
                        }
                        System.out.println("Total difference is " + difference);
                        break;
                    case 3:
                        double product = 1;
                        for (double num : numbers) {
                            product *= num;
                        }
                        System.out.println("Total product is " + product);
                        break;
                    case 4:
                        double division = numbers[0];
                        boolean divisionByZero = false;
                        for (int i = 1; i < n; i++) {
                            if (numbers[i] == 0) {
                                divisionByZero = true;
                                break;
                            }
                            division /= numbers[i];
                        }
                        if (divisionByZero) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            System.out.println("Total division result is " + division);
                        }
                        break;
                    case 5:
                        double modulus = numbers[0];
                        boolean modulusByZero = false;
                        for (int i = 1; i < n; i++) {
                            if (numbers[i] == 0) {
                                modulusByZero = true;
                                break;
                            }
                            modulus %= numbers[i];
                        }
                        if (modulusByZero) {
                            System.out.println("Error: Modulus by zero is not allowed.");
                        } else {
                            System.out.println("Total modulus result is " + modulus);
                        }
                        break;
                }
            } else if (choice == 6) {
                System.out.println("Exiting...");
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);
        scanner.close();
    }
}