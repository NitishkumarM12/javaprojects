class car
{
    String model;
    car(String model)
    {
        System.out.println(model);
    }
    void display()
    {
        System.out.println(model);
    }
}
public class stringref{
    public static void main(String[] args) {
        car c1 = new car("BMW");
        car c2 = c1;
        c2.model = "toyota";
        c1.display();
        c2.display();
        System.out.println(c1);
        System.out.println(c2); 
    }
}