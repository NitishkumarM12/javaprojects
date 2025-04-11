import java.util.Scanner;
public class userconstructor {
    int num1;
    int num2;
    Scanner scan = new Scanner(System.in);
    public userconstructor()
    {
        num1=10;
        num2=20;
        System.out.println("Non-parameterized constructor called");

    }
    public userconstructor(int n,int m)
    {
        num1=n;
        num2=m;
        System.out.println("Parameterized constructor called");
        System.out.println("enter opereand 1");
        num1 = scan.nextInt();
        System.out.println("enter opereand 2");
        num2 = scan.nextInt();
    }
    public void display()
    {
        System.out.println("Value of num1: "+num1);
        System.out.println("Value of num2: "+num2);
    }
    public static void main(String[] args) {
        userconstructor obj = new userconstructor();
        obj.display();
        userconstructor obj1 = new userconstructor(30,40);
        obj1.display();
    }
}
