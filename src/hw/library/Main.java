package hw.library;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookLibrary library = new BookLibrary();

        // Добавляем книги
        library.addBook("Война и мир", "Лев Толстой", 1869);
        library.addBook("Преступление и наказание", "Федор Достоевский", 1866);
        library.addBook("Мастер и Маргарита", "Михаил Булгаков", 1967);

        // Пробуем добавить дубликат
        library.addBook("Война и мир", "Лев Толстой", 1869);

        // Показываем весь каталог
        System.out.println("\nВсе книги в библиотеке:");
        library.printAllBooks();

        // Ищем книги по названиям и авторам
        System.out.println("\nКниги Лев Толстого:");
        List<Book> results = library.searchByAuthor("Толстой");
        for (Book book : results) {
            System.out.println(book);
        }

        System.out.println("\nКниги содержащие 'Маргарита':");
        Book[] findBooksWithTitle = library.searchByTitle("Маргарита");
        for (Book book : findBooksWithTitle) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }
}
