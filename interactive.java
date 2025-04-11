import java.util.Scanner;
public class interactive {
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
        if(op.equals("+"))
        {
            z = x + y;
        }
        else if(op.equals("-"))
        {
            z = x - y;
        }
        else if(op.equals("*"))
        {
            z = x * y;
        }
        else if(op.equals("/"))
        {
            z = x / y;
        }
        System.out.println("Result is "+z);
    }
}
