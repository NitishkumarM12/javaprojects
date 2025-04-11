class animal{
    String color = "white";
    }
class dog extends animal {
    String color = "brown";
    void display()
    {
        System.out.println("color");
        System.out.println(super.color);
    }
    void show()
    {
        System.out.println("Dog color: " + color);
        System.out.println("Animal color: " + super.color);
    }
}
public class inheritanceSUPER {
    public static void main(String[] args) {
        dog d = new dog();
        d.display();
        System.out.println("Dog color: " + d.color);
        d.show();        
    }
}