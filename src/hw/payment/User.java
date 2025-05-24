package hw.payment;

public abstract class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

   abstract void displayRole();

    public void loginMessage(){
        System.out.println("Пользователь "+email+" вошел");
    }
}

