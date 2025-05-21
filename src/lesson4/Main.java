package lesson4;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Circle();
        figure.draw();
        System.out.println(((Circle) figure).getDiameter());
    }
}
