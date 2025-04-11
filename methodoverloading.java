public class methodoverloading 
{
    static int display(int a) 
    {
        System.out.println("value of a: " + a);
        return 0;
    }

    void display(int a, int b) 
    {
        System.out.println("value of a and b: " + a + " " + b);
    }

    public static void main(String[] args) 
    {
        display(10);
        methodoverloading obj = new methodoverloading();
        obj.display(10, 20);
    }
}