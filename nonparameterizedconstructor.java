public class nonparameterizedconstructor {
    String name="John";
    int id=101;
    int age=25;
    public static void main(String[] args) 
    {
        nonparameterizedconstructor s1 = new nonparameterizedconstructor();
        System.out.println("Name: " + s1.name + " \nID: " + s1.id + "\nAge: " + s1.age);
    }
}
