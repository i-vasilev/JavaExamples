package hw.lesson5.enums;

public enum Apple {
    SIMIRENKO("Симиренко", 150),
    GOLDEN("Голден", 200),
    ;
    private final String name;
    private final double averageWeight;

    Apple(String name, double averageWeight) {
        this.name = name;
        this.averageWeight = averageWeight;
    }

    public void printName() {
        System.out.println(name);
    }

    public double calculateWeight(int count) {
        return averageWeight * count;
    }
}
