package lesson2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public final String name = "Slava";
    private static List<Integer> ids = new ArrayList<>();

    public static void main(String... args) {
        System.out.println(new Main().name.toUpperCase());

        final Box box = new Box(1, 2, 3);

        System.out.println(box.getVolume(5));
        Box box1 = BoxConstructor.makeBox();
        System.out.println(BoxConstructor.makeDefaultBigBox().getVolume(5));
        System.out.println("Факториал 3 = " + factorial(3));
        for (String s :
                args) {
            System.out.println(s);
        }

        addToIds(3, 3);
    }

    public static void addToIds(int... ids) {
        for (int id : ids) {
            Main.ids.add(id);
        }
    }

    public static int factorial(int n) {
        if (n != 1) {
            return n * factorial(--n);
        }
        return 1;
    }
}
