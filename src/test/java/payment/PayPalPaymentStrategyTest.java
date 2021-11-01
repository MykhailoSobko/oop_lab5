package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalCardPaymentStrategyTest {
    private PayPalPaymentStrategy payPalPaymentStrategy;

    @BeforeEach
    void setUp() {
        payPalPaymentStrategy = new PayPalPaymentStrategy();
    }

    @Test
    void pay() {
        assertTrue(payPalPaymentStrategy.pay(5.5));
    }
}