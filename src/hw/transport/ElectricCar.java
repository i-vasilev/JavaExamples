package hw.transport;

public class ElectricCar extends Car implements Servicable, Fuelable {
    public ElectricCar(String model, int year) {
        super(model, year);
    }

    public void refuel() {
        System.out.println("Электромобиль заряжается");
    }
}
