package hw.payment;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        Customer alice = new Customer("Alice", "alice@example.com", 500);
        alice.setPaymentMethod(new CreditCard());
        users.add(alice);


        Customer bob = new Customer("Bob", "bob@example.com", 100.0);
        bob.setPaymentMethod(new CryptoWallet());
        users.add(bob);

        Customer charlie = new Customer("Charlie", "charlie@crypto.com", 100.0);
        charlie.setPaymentMethod(new PayPal());
        users.add(charlie);

        Admin admin = new Admin("Admin", "bob@admin.com");
        users.add(admin);

        for (User user : users) {
            System.out.println("\n--- Вход пользователя ---");
            user.loginMessage();
            user.displayRole();

            if (user instanceof Customer) {
                Customer customer = (Customer) user;
                customer.makePayment(99.99);
            } else if (user instanceof Admin) {
                Admin adminUser = (Admin) user;
                adminUser.manageOrders();
            }
        }
    }
}
