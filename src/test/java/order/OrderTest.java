package order;

import delivery.Delivery;
import delivery.PostDeliveryStrategy;
import flowerstore.Flower;
import flowerstore.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import payment.PayPalPaymentStrategy;
import payment.Payment;
import user.Receiver;
import user.Sender;

import javax.management.OperationsException;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    private Order order;
    private Payment payment;
    private Delivery delivery;
    private Flower flower;
    private Sender sender;
    private Receiver receiver;

    @BeforeEach
    void setUp() {
        order = new Order();
        payment = new PayPalPaymentStrategy();
        delivery = new PostDeliveryStrategy();
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(5);
        sender = new Sender();
        receiver = new Receiver();
    }

    @Test
    void setPaymentStrategy() {
        order.setPaymentStrategy(payment);
    }

    @Test
    void setDeliveryStrategy() {
        order.setDeliveryStrategy(delivery);
    }

    @Test
    void addItem() {
        order.addItem(flower);
    }

    @Test
    void removeItem() {
        order.removeItem(flower);
        order.addItem(flower);
        order.removeItem(flower);
    }

    @Test
    void calculateTotalPrice() {
        order.addItem(flower);
        order.addItem(flower);
        assertEquals(10, order.calculateTotalPrice());
    }

    @Test
    void processOrder() {
        assertFalse(order.processOrder());
        order.addItem(flower);
        order.setPaymentStrategy(payment);
        order.setDeliveryStrategy(delivery);
        assertTrue(order.processOrder());
    }

    @Test
    void addUser() {
        order.addUser(sender);
        order.addUser(receiver);
    }

    @Test
    void removeUser() {
        order.addUser(sender);
        order.removeUser(sender);
        order.removeUser(receiver);
    }

    @Test
    void notifyUsers() {
        order.addUser(sender);
        order.addUser(receiver);
        order.notifyUsers("failed");
    }

    @Test
    void order() {
        order.addUser(sender);
        order.addUser(receiver);
        order.order();
    }
}