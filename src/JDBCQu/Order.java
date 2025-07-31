package JDBCQu;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

// Product class
class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Customer class
class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Order class
public class Order {
    private Long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;

    public Order(Long id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Product> products, Customer customer) {
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Order{id=" + id +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", products=" + products +
                ", customer=" + customer.getName() + '}';
    }

    // Main method to test the class
    public static void main(String[] args) {
        Customer customer = new Customer("Alice Johnson");

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop"));
        products.add(new Product("Smartphone"));

        Order order = new Order(
                12345L,
                "Shipped",
                LocalDate.now().minusDays(2),
                LocalDate.now().plusDays(3),
                products,
                customer
        );

        System.out.println(order);
    }
}
