package lesson9.singleton;

public class B {

    public A getA() {
        return A.getSingleton();
    }
}
