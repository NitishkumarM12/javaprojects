public class copyconstructor {
    String name;
    int age;
    copyconstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }
    copyconstructor(copyconstructor c) {
        name = c.name;
        age = c.age;
    }
    void display() {
        System.out.println(name + " " + age);
    }
    public static void main(String[] args) {
        copyconstructor c1 = new copyconstructor("John", 25);
        copyconstructor c2 = new copyconstructor(c1);
        c1.display();
        c2.display();
    }
}