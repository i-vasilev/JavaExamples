package hw.transport;

public class Main {
    public static void main(String[] args) {
        Transport[] transports = {
                new Car("BMW", 2017),
                new ElectricCar("Tesla", 2020),
                new Bicycle("Forward", 2025),
                new Airplane("Airbus", 2000)
        };
        for (Transport transport : transports) {
            if (transport.getClass().equals(Car.class)) {
                System.out.println("--- Автомобиль ---");
            }
            if (transport instanceof ElectricCar) {
                System.out.println("--- Электромобиль ---");
            }
            if (transport instanceof Bicycle) {
                System.out.println("--- Велосипед ---");
            }
            if (transport instanceof Airplane) {
                System.out.println("--- Самолет ---");
            }
            transport.startEngine();
            transport.move();
            if (transport instanceof Servicable) {
                ((Servicable) transport).performMaintenance();
            }
            if (transport instanceof Fuelable) {
                ((Fuelable) transport).refuel();
            }
            if (transport instanceof Airplane) {
                ((Airplane) transport).fly();
            }
        }
    }
}
