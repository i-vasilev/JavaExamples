package lesson9.singleton;

public class A {
    private int a;
    private int b;

    private static final A singleton = new A();

    private A() {
    }

    public static A getSingleton() {
        return singleton;
    }
}
