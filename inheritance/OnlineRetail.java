import java.util.*;

class Order {
    int orderId;
    Date orderDate;

    public Order(int orderId) {
        this.orderId = orderId;
        this.orderDate = new Date(); 
    }

    public String getOrderStatus() {
        return "Order Placed.";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(int orderId, String trackingNumber) {
        super(orderId);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped. Tracking #: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    Date deliveryDate;

    public DeliveredOrder(int orderId, String trackingNumber) {
        super(orderId, trackingNumber);
        this.deliveryDate = new Date(); 
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}

public class OnlineRetail {
    public static void main(String[] args) {
        Order order = new Order(101);
        ShippedOrder shipped = new ShippedOrder(102, "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder(103, "TRK67890");

        System.out.println("Order 101 Status: " + order.getOrderStatus());
        System.out.println("Order 102 Status: " + shipped.getOrderStatus());
        System.out.println("Order 103 Status: " + delivered.getOrderStatus());
    }
}