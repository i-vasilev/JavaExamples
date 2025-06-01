package lesson5.exceptions;

public class DivideByZeroException extends Exception {
    public DivideByZeroException(){
        super("Деление на ноль запрещено!");
    }
    public DivideByZeroException(Exception e) {
        super("Деление на ноль запрещено!", e);
    }
}
