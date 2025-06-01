package lesson6.generics;

public class Stats<T extends Number> {

    private T[] values;

    public void setValues(T[] value) {
        values = value;
    }

    public double average() {
        double sum = 0;
        for (T value : values) {
            sum += value.doubleValue();
        }
        return sum / values.length;
    }
}
