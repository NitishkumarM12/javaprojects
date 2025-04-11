public class methodoverloadig2 {
    public void add(int a, int b) {
        System.out.println("Sum of two numbers: " + (a + b));
    }
    public void add(int a, int b, int c) {
        System.out.println("Sum of three numbers: " + (a + b + c));
    }
    public void add(double a, double b) {
        System.out.println("Sum of two double numbers: " + (a + b));
    }
    public static void main(String[] args) {
        methodoverloadig2 obj = new methodoverloadig2();
        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(10.5, 20.5);
    }
}
