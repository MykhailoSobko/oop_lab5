package payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        System.out.format("Paid %.2f with PayPal\n", price);
        return true;
    }
}
