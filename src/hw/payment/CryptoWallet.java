package hw.payment;

public class CryptoWallet  implements PaymentMethod {
    private static final double MIN_AMOUNT = 0.01;

    @Override
    public boolean processPayment(double amount) {
        if (amount < MIN_AMOUNT) {
            System.out.println("Ошибка: Сумма слишком мала для оплаты криптой");
            return false;
        }

        System.out.printf("Оплата криптовалютой прошла успешно на сумму %.2f BTC%n", amount);
        return true;
    }

    @Override
    public String getMethodName() {
        return "Криптокошелёк";
    }
}
