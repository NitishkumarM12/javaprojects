class Product {
    String name;
    double price;
    String model;
    int quantity;

    // Default Constructor
    public Product() {
        this.name = "Unknown";
        this.price = 0.0;
        this.model = "Not Specified";
        this.quantity = 0;
    }

    // Constructor with Name and Price
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.model = "Not Specified";
        this.quantity = 0;
    }

    // Constructor with Name, Price, and Model
    public Product(String name, double price, String model) {
        this.name = name;
        this.price = price;
        this.model = model;
        this.quantity = 0;
    }

    // Constructor with all attributes
    public Product(String name, double price, String model, int quantity) {
        this.name = name;
        this.price = price;
        this.model = model;
        this.quantity = quantity;
    }

    // Display Method
    public void displayProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Model: " + model);
        System.out.println("Quantity: " + quantity);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        // Creating Objects Using Different Constructors
        Product p1 = new Product();
        Product p2 = new Product("Laptop", 75000);
        Product p3 = new Product("Smartphone", 50000, "Galaxy S23");
        Product p4 = new Product("Headphones", 2000, "Sony WH-1000XM5", 10);

        // Displaying Product Details
        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();
        p4.displayProduct();
    }
}