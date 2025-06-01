package lesson6.generics.genInterface;

public interface MinMax<T extends Comparable<T>> {

    T min();

    T max();
}
