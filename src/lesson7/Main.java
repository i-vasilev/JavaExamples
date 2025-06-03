package lesson7;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymus class");
            }
        };
        runnable.run();

        Runnable runnable1 = () -> System.out.println("lambda");
        runnable1.run();

        Consumer<String> consumer = (s1) -> System.out.println(s1);
        consumer.accept("consumer lambda");
        Consumer<String> consumer2 = System.out::println;
        consumer.accept("consumer linked lambda");

        Function<String, Integer> parser = (s) -> {
            int i = Integer.parseInt(s);
            return i * i;
        };
        Integer apply = parser.apply("1597");
        System.out.println(apply);

        Function<Integer, Integer> function = (i) -> i * 3;
        System.out.println(function.apply(5));

        BiFunction<Integer, Integer, Integer> minCalculator = Main::min;
        System.out.println(minCalculator.apply(10, 11));

        String[] words = {"яблоко", "груша", "банан", "Банан"};
        sortWords(words); // должно напечатать ["банан", "груша", "яблоко"]

        Integer[] numbers = {156, 14, 4, 3, 9};
        Arrays.sort(numbers, (i1, i2) -> {
            System.out.printf("%d %d %d\n", i1, i2, i2 - i1);
            return i2 - i1;
        });
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    private static void sortWords(String[] words) {
        Arrays.sort(words, String::compareToIgnoreCase);
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static Integer min(Integer num1, Integer num2) {
        return Math.min(num1, num2);
    }
}
