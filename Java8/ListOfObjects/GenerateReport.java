package Java8.ListOfObjects;

import java.time.LocalDateTime;
import java.util.*;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
    private String productId;
    private String name;
    private String category;
    private int quantity;
    private boolean inStock;
    private double price;

    public Product(String productId, String name, String category, int quantity, boolean inStock, double price) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.inStock = inStock;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Order1 {
    private int orderId;
    private List<Product> products;
    private double totalValue;
    private LocalDateTime orderTime;

    public Order1(int orderId, List<Product> products, double totalValue, LocalDateTime orderTime) {
        this.orderId = orderId;
        this.products = products;
        this.totalValue = totalValue;
        this.orderTime = orderTime;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }
}

class GenerateReport {
    public static void main(String[] args) {
        List<Order1> orders = Arrays.asList(
                new Order1(1, Arrays.asList(new Product("1", "I-Phone", "Electronics", 2, true, 5000),
                        new Product("2", "USB Cable", "Electronics", 3, true, 3000),
                        new Product("3", "Headphones", "Electronics", 1, false, 2000)
                ), 10000, LocalDateTime.now().minusHours(3)),

                new Order1(2, Arrays.asList(new Product("1", "T-Shirt", "Clothing", 3, true, 500),
                        new Product("2", "Jeans", "Clothing", 3, true, 1000)
                ), 1500, LocalDateTime.now().minusHours(5)),

                new Order1(3, Arrays.asList(new Product("1", "Sandals", "Footwear", 1, true, 800),
                        new Product("2", "Sneakers", "Footwear", 1, false, 400)
                ), 1200, LocalDateTime.now().minusHours(2)),

                new Order1(4, Arrays.asList(new Product("1", "Cookware-set", "Home and Kitchen", 1, true, 1000),
                        new Product("2", "Knife", "Home and Kitchen", 2, false, 100)
                ), 1100, LocalDateTime.now().minusHours(26)),

                new Order1(5, Arrays.asList(new Product("1", "I-Phone", "Electronics", 1, true, 5000),
                        new Product("1", "T-Shirt", "Clothing", 1, false, 500)
                ), 5500, LocalDateTime.now().minusHours(1)));

        Map<String, Integer> collect = orders.stream()
                .filter(o -> o.getOrderTime()
                        .isAfter(LocalDateTime.now().minusHours(24)) && o.getTotalValue() > 1100)
                .flatMap(o -> o.getProducts().stream())
                .filter(Product::isInStock)
                .collect(Collectors.groupingBy(
                        Product::getCategory
                        , Collectors.summingInt(Product::getQuantity)
                ))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new
                ));
        System.out.println(collect);
    }
}
