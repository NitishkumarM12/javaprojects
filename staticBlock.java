public class staticBlock 
{
    {
        System.out.println("instance block 1");

    }
    static 
    {
        System.out.println("Static block 1");
    }
    {
        System.out.println("instance block 2");

    }
    static 
    {
        System.out.println("Static block 2");
    }
    public static void main(String[] args) 
    {
        System.out.println("Main method is executed");
        staticBlock s = new staticBlock();
        System.out.println("Object is created"+s);
    }
}