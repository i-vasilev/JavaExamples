package hw.transport;

public class Airplane extends Transport implements Servicable, Fuelable {
    public Airplane(String model, int year) {
        super(model, year);
    }

    @Override
    public void refuel() {
        System.out.println("Самолёт заправлен");
    }

    @Override
    public void performMaintenance() {
        System.out.println("Выполняется техобслуживание самолёта");
    }

    @Override
    public void move() {
        System.out.println("Самолёт летит в воздухе");
    }

    public void fly(){
        System.out.println("Поднимается в воздух");
    }
}
