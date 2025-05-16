package lesson3;

public class Drink {
    public static final String SMALL = "small";
    public static final String MEDIUM = "medium";
    public static final String BIG = "big";
    private final String name;
    private final String size;
    private final double basePrice;

    public Drink(String name, String size, double basePrice) {
        this.name = name;
        this.size = size;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double calculatePrice() {
        return switch (size) {
            case SMALL -> basePrice;
            case MEDIUM -> basePrice + 10;
            case BIG -> basePrice + 20;
            default -> basePrice;
        };
    }

    @Override
    public String toString() {
        return String.format("%s. Размер: %s. Цена: %f руб.", name, size, calculatePrice());
    }
}
