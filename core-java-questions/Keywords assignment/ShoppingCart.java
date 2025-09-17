class Product {
    static double discount = 10.0;  

    final int productID;
    String productName;
    double price;
    int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            double total = (price * quantity) - ((price * quantity) * discount / 100);
            System.out.println("Total after discount: " + total);
        }
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Product p1 = new Product(301, "Laptop", 50000, 1);
        Product p2 = new Product(302, "Headphones", 2000, 2);

        p1.displayDetails();
        System.out.println("-----------------");
        p2.displayDetails();

        Product.updateDiscount(15.0);
        System.out.println("After updating discount:");
        p1.displayDetails();
    }
}
