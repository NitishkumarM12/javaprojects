class animal {
    String color = "white";
    void eat() {
        System.out.println("eating...");
    }
}
class dog extends animal {
    String color = "black";
    void printcolor() {
        System.out.println(color);
        System.out.println(super.color);
    }
    void eat() {
        System.out.println("eating bread...");
        super.eat();
        }
    }
public class inheritance {
    public static void main(String[] args) {
        dog d = new dog();
        d.printcolor();
        d.eat();
    }
    
}
