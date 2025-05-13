package lesson2;

public class BoxConstructor {

    public static final int DEFAULT_WIDTH_BIG = 60;
    public static final int DEFAULT_LENGTH_BIG = 60;
    public static final int DEFAULT_DEPTH_BIG = 50;
    private static int a;

    static {
        a = 2;
        System.out.println("Инициализация статического контекста");
    }

    public static Box makeDefaultBigBox() {
        return new Box(DEFAULT_WIDTH_BIG, DEFAULT_LENGTH_BIG, DEFAULT_DEPTH_BIG);
    }

    public static Box makeBox() {
        return new Box();
    }
}
