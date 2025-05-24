package hw.transport;

public class Bicycle extends Transport implements Servicable {

    public Bicycle(String model, int year) {
        super(model, year);
    }

    @Override
    public void performMaintenance() {
        System.out.println("Выполняется техобслуживание велосипеда");
    }

    @Override
    public void move() {
        System.out.println("Велосипед движется на педалях");
    }
}
