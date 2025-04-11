public class demo {
    public static void main(String[] args) {
        String name = "World";
        if(args != null && args.length > 0){
            name = args[0];
        }
        System.out.println("Hello, " + name + " welcome to java programming");
    }
}