package payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        System.out.format("Paid %.2f with credit card\n", price);
        return true;
    }
}
