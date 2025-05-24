package hw.payment;

public class CreditCard implements PaymentMethod {
    @Override
    public boolean processPayment(double amount) {
        System.out.printf("Опала картой прошла успешно на сумму %.2f%n", amount);
        return true;
    }

    @Override
    public String getMethodName() {
        return "Кредитная карта";
    }
}
