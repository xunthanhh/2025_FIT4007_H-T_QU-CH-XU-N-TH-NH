package buoi3.OrderItem;

import java.util.ArrayList;
import java.util.List;

// Lớp OrderItem
class OrderItem {
    private String name;    // tên sản phẩm
    private int quantity;   // số lượng
    private double price;   // giá 1 đơn vị

    public OrderItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotalPrice() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return name + " x" + quantity + " = " + getTotalPrice();
    }
}

// Lớp Order
class Order {
    private List<OrderItem> items;  // chứa nhiều OrderItem

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double getTotalAmount() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public void printOrder() {
        System.out.println("Chi tiết đơn hàng:");
        for (OrderItem item : items) {
            System.out.println(item);
        }
        System.out.println("Tổng tiền: " + getTotalAmount());
    }
}

// Main kiểm thử
public class Oder {
    public static void main(String[] args) {
        // Tạo các OrderItem
        OrderItem item1 = new OrderItem("Bánh mì", 2, 15000);
        OrderItem item2 = new OrderItem("Sữa tươi", 3, 20000);
        OrderItem item3 = new OrderItem("Trà sữa", 1, 40000);

        // Tạo đơn hàng
        Order order = new Order();
        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);

        // In ra đơn hàng và tổng tiền
        order.printOrder();
    }
}

