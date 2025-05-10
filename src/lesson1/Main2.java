package lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        switch (num) {
            case 0 -> System.out.println("ноль");
            case 1 -> System.out.println("один");
            case 2 -> System.out.println("два");
            default -> System.out.println("не поддерживаемое значение");
        }

        int i, j;
        i = 100;
        j = 200;
        for (int k = 0; k < 5; k++) {
            if (num > 6) {
                return;
            }
            System.out.println(k);
        }
        List<Integer> lst = new ArrayList<>();
        // найти среднюю точку между i и j
        while (++i < --j) ; // тело в цикле отсутствует
        System.out.println("Cpeдняя точка равна " + i);
    }
}
