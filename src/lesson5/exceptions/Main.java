package lesson5.exceptions;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(new Calculator().divide(3, 0));
        } catch (Exception e) {
            System.out.println("Деление на ноль ");
        }
        General customer = new A();
        try {
            B admin = (B) customer;
            System.out.println(5 / 0);

        } catch (ClassCastException exception) {
            System.out.println("не смог привести к типу B");
        } catch (ArithmeticException exception) {
            System.out.println("Деление на ноль");
        } finally {
            System.out.println("Этот код всегда выполняется");
        }

        try {
            try {
                System.out.println(5 / 0);
            } catch (ArithmeticException exception) {
                throw new DivideByZeroException(exception);
            }
            B admin = (B) customer;
        } catch (ClassCastException | DivideByZeroException exception) {
            System.out.println("Обработка исключения " + exception.getMessage());
            exception.printStackTrace();
        }

        Integer.parseInt("asdasdsd");
    }
}
