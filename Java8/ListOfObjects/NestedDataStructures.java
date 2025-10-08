package Java8.ListOfObjects;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Order {
    private int orderId;
    private LocalDate orderDate;
    private List<OrderItem> items;

    public Order(int orderId, LocalDate orderDate, List<OrderItem> items) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.items = items;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderDate=" + orderDate +
                ", items=" + items +
                '}';
    }
}

class OrderItem {
    private String productId;
    private int quantity;
    private double price;

    public OrderItem(String productId, int quantity, double price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "productId='" + productId + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}

public class NestedDataStructures {
    public static void main(String[] args) {

        int year = 2025;
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, LocalDate.now(), List.of(new OrderItem("01", 20, 500.0))));
        orders.add(new Order(2, LocalDate.now(), List.of(new OrderItem("02", 30, 800.0))));
        orders.add(new Order(3, LocalDate.now().plusYears(2), List.of(new OrderItem("03", 10, 200.0))));

        double sum = orders.stream().filter(order -> order.getOrderDate().getYear() == year)
                .flatMap(order -> order.getItems().stream())
                .mapToDouble(value -> value.getPrice() * value.getQuantity())
                .sum();

        System.out.println(sum);
    }
}
