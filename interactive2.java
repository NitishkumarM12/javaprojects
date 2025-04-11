import java.util.Scanner;
public class interactive2 {
    public static void main(String[] args) {
        int x, y, z = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter opereand 1");
        x = scan.nextInt();
        System.out.println("enter opereand 2");
        y = scan.nextInt();
        System.out.println("enter operator which you want to perform(+,-,*,/)");
        String op = scan.next();
        scan.close();
        switch (op) 
        {
            case "+":z = x + y;
                break;
            case "-":z = x - y;
                break;
            case "*":z = x * y;
                break;
            case "/":z = x / y;
                break;
        }
        System.out.println("Result is "+z);
    }
}
