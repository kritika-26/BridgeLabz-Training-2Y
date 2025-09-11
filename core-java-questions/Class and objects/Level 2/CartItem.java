import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }

    double getCost() {
        return price * quantity;
    }

    void display() {
        System.out.println(itemName + " | Price: " + price + " | Quantity: " + quantity + " | Cost: " + getCost());
    }
}

class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();

    void addItem(String name, double price, int qty) {
        items.add(new CartItem(name, price, qty));
        System.out.println(name + " added to cart.");
    }

    void removeItem(String name) {
        items.removeIf(item -> item.itemName.equalsIgnoreCase(name));
        System.out.println(name + " removed from cart.");
    }

    void displayTotal() {
        double total = 0;
        System.out.println("\n--- Cart Items ---");
        for (CartItem item : items) {
            item.display();
            total += item.getCost();
        }
        System.out.println("Total Cost: " + total);
    }
}

public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop", 50000, 1);
        cart.addItem("Mouse", 700, 2);
        cart.displayTotal();

        cart.removeItem("Mouse");
        cart.displayTotal();
    }
}
