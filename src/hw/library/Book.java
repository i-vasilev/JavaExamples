package hw.library;

public class Book {
    private String title;
    private String author;
    private int year;
    private int id;

    public Book(int id, String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | %s (%s), %d год", id, title, author, year);
    }
}

