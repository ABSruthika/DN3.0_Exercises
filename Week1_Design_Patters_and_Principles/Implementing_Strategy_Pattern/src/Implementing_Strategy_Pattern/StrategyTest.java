package Implementing_Strategy_Pattern;

public class StrategyTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment(100.00);

        context.setPaymentStrategy(new PayPalPayment());
        context.executePayment(200.00);
    }
}
