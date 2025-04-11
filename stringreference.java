public class stringreference {
    String name;
    static void change(stringreference s) {
        s.name = "John";
    }
    public static void main(String[] args) {
        stringreference s = new stringreference();
        s.name = "Smith";
        System.out.println("Before change: " + s.name);
        change(s);
        System.out.println("After change: " + s.name);
    }
}
