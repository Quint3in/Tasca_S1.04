package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }
    @Test
    void booksCollection_shouldNotBeNull() {
        assertNotNull(library.getBooks());
    }

    @Test
    void sizeOfBooks_afterAddingBook() {
        library.addBook(new Book("Test Title"));
        library.addBook(new Book("Test Title2"));
        library.addBook(new Book("Test Title3"));
        assertEquals(3, library.getBooks().size());
    }

    @Test
    void addBook_shouldPlaceBookInExpectedPosition() {
        library.addBook(new Book("Test Title"));
        library.addBook(new Book("Test Title2"));
        library.addBook(new Book("Test Title3"));
        assertEquals("Test Title3", library.getTitleByPosition(2));
    }

    @Test
    void getBookByPosition_shouldReturnBook() {
        library.addBook(new Book("Test Title1"));
        library.addBook(new Book("Test Title2"));
        library.addBook(new Book("Test Title3"));

        assertEquals("Test Title2",library.getTitleByPosition(1));
    }
    @Test
    void addBookByPosition_shouldPlaceBookInExpectedPosition() {
        library.addBook(new Book("Test Title"));
        library.addBook(new Book("Test Title2"));
        library.addBookByPosition(new Book("Test Title3"),1);
        assertEquals("Test Title3", library.getTitleByPosition(1));
    }

    @Test
    void removeBookByTitle_shouldDecreaseBooksSize() {
        library.addBook(new Book("Test Title"));
        library.addBook(new Book("Test Title2"));
        library.addBook(new Book("Test Title3"));

        library.removeBookByTitle("Test Title");
        assertEquals(2, library.getBooks().size());
    }

    @Test
    void getSortedBooks_shouldReturnAlphabeticalOrder_withoutModifyingOriginalCollection() {
        library.addBook(new Book("ATest Title"));
        library.addBook(new Book("CTest Title"));
        library.addBook(new Book("BTest Title"));
        List<Book> sortedBooks = library.getSortedBooks();

        assertEquals(List.of("ATest Title", "BTest Title", "CTest Title"),
                sortedBooks.stream().map(Book::getTitle).toList());
        assertNotSame(sortedBooks, library.getBooks());
    }

    @Test
    void booksCollection_shouldNotHaveDuplicates() {
        library.addBook(new Book("Test Title"));
        assertFalse(library.addBook(new Book("Test Title")));
        assertFalse(library.addBookByPosition(new Book("Test Title"), 0));
    }


}
