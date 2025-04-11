class animal{
   void sound(){
         System.out.println("Animal sound");
    }
}
class dog extends animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
public class inheritanceOVERRIDE {
    public static void main(String[] args) {
        animal a = new animal();
        a.sound(); // Output: Animal sound
        dog d = new dog();
        d.sound(); // Output: Dog barks
    }
}
