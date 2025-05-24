package hw.payment;

public class Customer extends User {
    private double balance;
    private PaymentMethod paymentMethod;

    public Customer(String name, String email, double balance) {
        super(name, email);
        this.balance = balance;
    }

    void makePayment(double amount) {
        if (amount > balance) {
            System.out.println("Ошибка: Недостаточно средств на балансе");
            return;
        }
        pay(amount);
    }

    void pay(double amount) {
        System.out.println("Выбран способ оплаты: "+paymentMethod.getMethodName());
        paymentMethod.processPayment(amount);

    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    void displayRole() {
        System.out.println("Клиент");
    }
}
