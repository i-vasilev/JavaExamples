package lesson4;

public interface Figure {
    void draw();

    default void someMethod() {
        draw();
    }
}
