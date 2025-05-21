package hw.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    public static final int BOOKS_MAX_COUNT = 100;
    private Book[] books;
    private int countBook;
    private static int nextId = 1;

    public BookLibrary() {
        this.books = new Book[BOOKS_MAX_COUNT];
        this.countBook = 0;
    }

    public void addBook(String title, String author, int year) {
        for (int i = 0; i < countBook; i++) {
            if (books[i].getTitle().equals(title) && books[i].getAuthor().equals(author)) {
                System.out.println("Предупреждение: Книга '" + title + "' автора " + author + " уже существует в библиотеке.");
                return;
            }
        }
        if (countBook < 100) {
            Book book = new Book(nextId++, title, author, year);
            books[countBook++] = book;
            System.out.println(String.format("Книга: %10s (%s), %d год", book.getTitle(), book.getAuthor(), book.getYear()));
        } else {
            System.out.println("Библиотека заполнена, нельзя добавить больше книг.");
        }
    }

    public void printAllBooks() {
        if (countBook == 0) {
            System.out.println("Список книг пуст");
        }
        for (int i = 0; i < countBook; i++) {
            System.out.println(books[i]);
        }
    }

    public Book[] searchByTitle(String keyword) {
        Book[] result = new Book[BOOKS_MAX_COUNT];
        int booksCounter = 0;
        for (int i = 0; i < countBook; i++) {
            if (books[i].getTitle().contains(keyword)) {
                result[booksCounter++] = books[i];
            }
        }
        return result;
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (int i = 0; i < countBook; i++) {
            if (books[i].getAuthor().contains(author)) {
                result.add(books[i]);
            }
        }
        return result;
    }
}
