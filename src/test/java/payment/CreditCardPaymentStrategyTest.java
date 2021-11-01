package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {
    private CreditCardPaymentStrategy creditCardPaymentStrategy;

    @BeforeEach
    void setUp() {
        creditCardPaymentStrategy = new CreditCardPaymentStrategy();
    }

    @Test
    void pay() {
        assertTrue(creditCardPaymentStrategy.pay(5.5));
    }
}