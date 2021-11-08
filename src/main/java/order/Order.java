package order;

import delivery.Delivery;
import flowerstore.Item;
import payment.Payment;
import user.User;

import java.util.LinkedList;
import java.util.List;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;
    private List<User> users;

    public Order() {
        this.items = new LinkedList<>();
        this.users = new LinkedList<>();
    }

    public void setPaymentStrategy(Payment paymentStrategy) {
        this.payment = paymentStrategy;
    }

    public void setDeliveryStrategy(Delivery deliveryStrategy) {
        this.delivery = deliveryStrategy;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Item item : this.items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public boolean processOrder() {
        if (this.items.isEmpty()) {
            System.out.println("Item list is empty\n");
            return false;
        }
        if (this.payment == null) {
            System.out.println("Select payment method\n");
            return false;
        }
        if (this.delivery == null) {
            System.out.println("Select delivery method\n");
            return false;
        }
        System.out.println("Processing order...");
        this.payment.pay(this.calculateTotalPrice());
        this.delivery.deliver(this.items);
        return true;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void removeUser(User user) {
        this.users.remove(user);
    }

    public void notifyUsers(String status) {
        this.users.forEach(user -> user.update(status));
    }

    public void order() {
        this.notifyUsers("success");
    }
}
