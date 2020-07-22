import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class LibraryTest {

        private Book book;
        private Library library;
        Borrower borrower;

        @Before
        public void before(){
            this.library = new Library(4);
            this.book = new Book("Catch 22", "Joseph Heller", "Fiction");
            borrower = new Borrower("John");
            borrower.borrow(book);

        }

        @Test
        public void canAddBookToLibrary() {
            library.addBook(book);
            library.addBook(book);
            library.addBook(book);
            assertEquals(3, library.bookCount());
        }

        @Test
        public void canRemoveBookFromLibrary() {
            library.addBook(book);
            library.addBook(book);
            library.removeBook(book);
            assertEquals(1, library.bookCount());
        }

        @Test
        public void canReturnBook() {
            library.receiveBook(borrower);
            assertEquals(1, library.bookCount());
            assertEquals(0, borrower.amountOfBooks());
        }

    }
