package hw.payment;

public class Admin extends User{

    public Admin(String name, String email) {
        super(name, email);
    }

    @Override
    void displayRole() {
        System.out.println("Администратор");
    }

    void manageOrders(){
        System.out.println("Администратор управляет заказами.");
    }
}
