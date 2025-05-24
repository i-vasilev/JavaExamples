package hw.payment;

public interface PaymentMethod {
    boolean processPayment (double amount);
    String getMethodName();
}
