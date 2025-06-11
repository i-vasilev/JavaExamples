package hw.calculator;

import java.util.Scanner;


public class LambdaCalculator {
    public static void main(String[] args) {
        MathExecutor[] operations = {
                (a, b) -> a + b,
                (a, b) -> a - b,
                (a, b) -> a * b,
                (a, b) -> {
                    if (b == 0) {
                        throw new ArithmeticException("Деление на ноль");
                    }
                    return a / b;
                }
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nВыберите операцию:");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");
        System.out.print("> ");

        int choice = scanner.nextInt();

        while (choice < 1 || choice > 4) {
            System.out.println("Неверный выбор операции");
            System.out.println("Введите верную операцию: ");
            choice = scanner.nextInt();
        }
        double result = operations[choice - 1].execute(num1, num2);
        System.out.println("Результат: " + result);
    }
}


