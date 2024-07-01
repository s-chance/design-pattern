package org.entropy;

public class Application {
    public static void main(String[] args) {
        PayStrategy payPal = paymentAmount -> {
            double discount = paymentAmount * 0.8;
            System.out.println("using paypal to pay " + discount);
        };

        PayStrategy creditCard = paymentAmount -> {
            double discount = paymentAmount * 0.75;
            System.out.println("using credit card to pay " + discount);
        };

        payPal.pay(1000);
        creditCard.pay(1000);
    }
}
