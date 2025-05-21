package hw.zoo;

public class Dog extends Animal{
    private double jumpHeight;
    public Dog(String name, int age, double weight, double jumpHeight) {
        super(name, age, weight);
        this.jumpHeight=jumpHeight;

    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public void makeSound(){
        System.out.println("Собака "+getName()+" лает.");
    }

    public void eat(){
        System.out.println("Собака "+getName()+" ест.");
    }

    public void sleep(){
        System.out.println("Собака "+getName()+" спит.");
    }
}
