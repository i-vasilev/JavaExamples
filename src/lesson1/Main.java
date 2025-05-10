package lesson1;

import java.util.Scanner;

public class Main {
    static Integer a = 2;

    public static void main(String[] args) {
        int c = 6;
        if (c == 6) {
            int a = 3;
            System.out.println("Переменная a в блоке if: " + a);
        }
        int a = someMethod();
        System.out.println("Переменная a в методе: " + a);
        System.out.println("Переменная-поле а: " + (5 / Main.a));
        byte b = (byte) a;
        double d = 23.4;
        char ch = 'd';
        int chInt = ch;

        int[][] t = {{3, 4, 2},
                {3, 2, 1}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(t[i][j]);
            }
            System.out.println();
        }

        int z = b++ / 2;

        var thr1 = new Thread();
        var thr2 = new Thread();

        System.out.println(thr1.equals(thr2));

        Scanner scanner = new Scanner(System.in);
        String str1 = "jhfjd";
        String str2 = "jhfjd";
        System.out.println(str1 == str2);

        int num = scanner.nextInt();
        String str = num < 5
                ? "a"
                : "b";
        System.out.println(str);

        System.out.println(num != 0 && (5 / num == 2));

        if (str.equals("a") && num == 7) {
            System.out.println("Выполнился");
        } else if (str.equals("c")) {

        } else if (str.equals("b")) {

        } else {

        }
    }



    public static int someMethod() {
        return 76;
    }
}