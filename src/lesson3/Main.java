package lesson3;

public class Main {
    public static void main(String[] args) {
        Drink espresso = new Drink("Эспрессо", "small", 50);
        Drink cappuccino = new Drink("Капучино", "big", 90);
        Drink latte = new Drink("Латте", "medium", 90);

        System.out.println(espresso);
        System.out.println(cappuccino);
        System.out.println(latte);

        CoffeeShop starbucks = new CoffeeShop();
        starbucks.addSoldDrink(espresso);
        starbucks.addSoldDrink(cappuccino);
        starbucks.addSoldDrink(latte);

        System.out.println("Общий доход: " + starbucks.totalRevenue());
    }
}
