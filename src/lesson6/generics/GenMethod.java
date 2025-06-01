package lesson6.generics;

import java.util.Objects;

public class GenMethod {
    public static <T> boolean isIn(T[] arr, T value) {
        for (T t : arr) {
            if (Objects.equals(t, value))
                return true;
        }
        return false;
    }
}
