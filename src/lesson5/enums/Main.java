package lesson5.enums;

public class Main {
    public static void main(String[] args) {
        Apple apple = Apple.GOLDEN;
        System.out.println(apple);
        Apple apple2 = Apple.valueOf("SIMIRENKO");
        System.out.println(apple2);
        apple2.printName();

        System.out.println(apple.calculateWeight(5));
    }

    public void printSomeText(Apple apple) {
        switch (apple) {
            case SIMIRENKO -> {
                System.out.println("gjfhdg");
            }
            case GOLDEN -> {
                System.out.println("sdfgsd");
            }
        }
    }
}
