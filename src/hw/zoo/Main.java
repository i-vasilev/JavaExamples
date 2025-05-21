package hw.zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal cat1 = new Cat("Маруся", 4, 4, 4);
        Animal dog1 = new Dog("Альфа", 3, 25, 2);
        zoo.addAnimal(cat1);
        zoo.addAnimal(dog1);
        cat1.eat();
        cat1.sleep();
        cat1.makeSound();
        dog1.eat();
        dog1.sleep();
        dog1.makeSound();
        zoo.showAnimalsInfo();
        zoo.sleep();
    }
}