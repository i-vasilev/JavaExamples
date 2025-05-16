package lesson3;

public class CoffeeShop {
    private Drink[] drinks = new Drink[100];
    private int countSoldDrinks = 0;

    public void addSoldDrink(Drink drink) {
        if (countSoldDrinks != 100) {
            drinks[countSoldDrinks++] = drink;
        }
    }

    public double totalRevenue() {
        double result = 0;
        for (int i = 0; i < countSoldDrinks; i++) {
            result += drinks[i].calculatePrice();
        }
        return result;
    }


}
