package hw.transport;

public class Car extends Transport implements Servicable, Fuelable {

    public Car(String model, int year) {
        super(model, year);
    }

    @Override
    public void move() {
        System.out.println("Автомобиль марки "+getModel()+" едет по дороге");
    }

    @Override
    public void performMaintenance() {
        System.out.println("Выполняется техобслуживание автомобиля");
    }

    @Override
    public void refuel() {
        System.out.println("Автомобиль заправлен");
    }
}
