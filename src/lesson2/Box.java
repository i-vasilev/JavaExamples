package lesson2;

public class Box {
    private int width;
    private int length;
    private int depth;

    public Box(int width, int length, int depth) {
        this.width = width;
        this.length = length;
        this.depth = depth;
    }

    public Box() {
        this.width = 1;
        this.length = 1;
        this.depth = 1;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getDepth() {
        return depth;
    }

    public int getVolume() {
        return length * width * depth;
    }

    public int getVolume(int count) {
        return getVolume() * count;
    }
}
