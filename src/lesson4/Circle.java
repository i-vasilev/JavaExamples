package lesson4;

public class Circle extends AbstractFigure {
    @Override
    public void draw() {
        System.out.println("Рисую круг");
    }

    public int getDiameter() {
        return 3;
    }
}
