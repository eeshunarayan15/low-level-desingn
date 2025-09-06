package Lesson1.HomeWork;

class Order {
    private String orderId;
    private double amount;
    private User user;
    
    public Order(String orderId, double amount, User user) {
        this.orderId = orderId;
        this.amount = amount;
        this.user = user;
    }
    
    public String getOrderId() { return orderId; }
    public double getAmount() { return amount; }
    public User getUser() { return user; }
}

class User {
    private String email;
    private String name;
    
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    public String getEmail() { return email; }
    public String getName() { return name; }
}

// SRP: Only responsible for calculating totals
class OrderCalculator {
    public double calculateTotalSum(Order order) {
        return order.getAmount() * 1.1; // 10% tax
    }
}

// SRP: Only responsible for email notifications
class EmailService {
    public void sendEmailNotification(User user, String message) {
        System.out.println("Sending email to " + user.getEmail() + ": " + message);
    }
}

// SRP: Only responsible for orchestrating the order process
public class OrderProcessor {
    private OrderCalculator calculator;
    private EmailService emailService;
    
    public OrderProcessor() {
        this.calculator = new OrderCalculator();
        this.emailService = new EmailService();
    }
    
    public void processOrder(Order order) {
        double total = calculator.calculateTotalSum(order);
        emailService.sendEmailNotification(order.getUser(), 
            "Order processed. Total: $" + total);
    }
}
