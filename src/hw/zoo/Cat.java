package hw.zoo;


public class Cat extends Animal {
    private double furLength;

    public Cat(String name, int age, double weight, double furLength) {
        super(name, age, weight);
        this.furLength = furLength;
    }

    public double getFurLength() {
        return furLength;
    }

    public void makeSound() {
        System.out.println("Кошка " + getName() + "мяукает.");
    }

    public final void eat() {
        System.out.println("Кошка " + getName() + " ест");
    }

    public void sleep() {
        System.out.println("Кошка " + getName() + " спит");
    }

}
