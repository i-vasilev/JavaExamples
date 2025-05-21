package lesson4.interfaces;

public class ClassB implements B {
    @Override
    public void someMethod1() {

        B classA = new ClassB();
        classA.someMethod2();
    }

    @Override
    public void someMethod2() {

    }
}
