package hw.zoo;

public class Zoo {
    private Animal[] animals;
    private int animalCount;

    public Zoo() {
        this.animals = new Animal[100];
        this.animalCount = 0;
    }

    public void addAnimal(Animal animal) {
        if (animalCount < 5) {
            animals[animalCount++] = animal;
            System.out.println("Животное " + animal.getName() + " добавлено");
        } else {
            System.out.println("Зоопарк переполнен");
        }
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void showAnimalsInfo() {
        System.out.println("Животные которые проживают в зоопарке: ");
        for (int i = 0; i < animalCount; i++) {
            Animal animal = animals[i];
            StringBuilder stringBuilder = new StringBuilder()
                    .append("Имя: %s, Возраст: %d, Вес: %f".formatted(animal.getName(), animal.getAge(), animal.getWeight()));
            if (animal.getClass().equals(Cat.class)) {
                stringBuilder.append(", длина шерсти: " + ((Cat) animal).getFurLength());
            }
            if (animal.getClass().equals(Dog.class)) {
                stringBuilder.append(", высота прыжка: " + ((Dog) animal).getJumpHeight());
            }
            System.out.println(stringBuilder);
        }
    }

    public void sleep() {
        for (int i = 0; i < animalCount; i++) {
            animals[i].sleep();
        }
    }
}
