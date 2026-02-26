package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public boolean addBook(Book book) {
        boolean exists = books.stream().anyMatch(
                b -> b.getTitle().equals(book.getTitle()));
        if (exists) return false;

        this.books.add(book);
        return true;
    }
    public List<Book> getBooks() {
        return books;
    }
    public String getTitleByPosition(int position) {
        return this.books.get(position).getTitle();
    }
    public boolean addBookByPosition(Book book, int position) {
        boolean exists = books.stream().anyMatch(
                b -> b.getTitle().equals(book.getTitle()));
        if (exists) return false;

        this.books.add(position,book);
        return true;
    }
    public boolean removeBookByTitle(String title) {
        return this.books.removeIf(book -> book.getTitle().equals(title));
    }
    public List<Book> getSortedBooks() {
        List<Book> sortedBooks = new ArrayList<>(this.books);
        sortedBooks.sort(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
        return sortedBooks;
    }
}

