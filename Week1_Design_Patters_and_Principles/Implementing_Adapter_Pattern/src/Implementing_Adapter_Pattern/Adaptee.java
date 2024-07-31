package Implementing_Adapter_Pattern;

class StripePayment {
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made using Stripe.");
    }
}

class PayPalPayment {
    public void sendPayment(double amount) {
        System.out.println("Payment of $" + amount + " made using PayPal.");
    }
}
