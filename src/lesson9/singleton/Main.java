package lesson9.singleton;

public class Main {
    public static void main(String[] args) {
//        A a = new A(); // Так делать нельзя
        A singleton1 = new B().getA();
        A singleton2 = A.getSingleton();
        System.out.println(singleton1.equals(singleton2));
    }
}
