import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class BorrowerTest {

        Borrower borrower;
        Book book;

        @Before
        public void setUp() {
            borrower = new Borrower("John");
            book = new Book("Catch 22", "Joseph Heller", "Fiction");
        }

        @Test
        public void canBorrowBook() {
            borrower.borrow(book);
            assertEquals(1, borrower.amountOfBooks());
        }

        @Test
        public void canReturnToLibrary() {
            borrower.borrow(book);
            borrower.returnBook();
            assertEquals(0, borrower.amountOfBooks());
        }

}
