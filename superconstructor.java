class animal{
    animal()
    {
        System.out.println("Parent class constructor");
    }
    animal(int b)
    {
        System.out.println(b);
    }
}
class dog extends animal{
    dog()
    {
        super(10);
        System.out.println("child class constructor");
    }
    dog(int a)
    {
        this();
        System.out.println(a);
    }
}
public class superconstructor {
    public static void main(String[] args) {
        dog d = new dog(5);
        System.out.println("Dog constructor called with parameter: " + d);
        
    }
}
