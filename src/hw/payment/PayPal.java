package hw.payment;

import java.util.Random;

public class PayPal implements PaymentMethod {
    private final Random random = new Random(100);

    @Override
    public boolean processPayment(double amount) {
        double nextDouble = random.nextDouble();
        System.out.println(nextDouble);
        boolean success = nextDouble < 0.5;
        if (success) {
            System.out.println("Оплата через PayPal успешна " + amount);
        } else {
            System.out.println("Ошибка оплаты через PayPal");
        }
        return success;
    }

    @Override
    public String getMethodName() {
        return "PayPal";
    }
}
