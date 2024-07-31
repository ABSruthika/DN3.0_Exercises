package Implementing_Adapter_Pattern;

public class AdapterTest {
    public static void main(String[] args) {
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripePayment());
        stripeProcessor.processPayment(100.00);

        PaymentProcessor payPalProcessor = new PayPalAdapter(new PayPalPayment());
        payPalProcessor.processPayment(200.00);
    }
}
