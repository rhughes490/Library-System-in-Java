import java.util.ArrayList;

    public class Borrower {

        private String name;
        private ArrayList<Book> borrowedBooks;

        public Borrower(String name) {
            this.name = name;
            this.borrowedBooks = new ArrayList<Book>();
        }

        public int amountOfBooks() {
            return this.borrowedBooks.size();
        }

        public void borrow(Book book) {
            this.borrowedBooks.add(book);
        }

        public Book returnBook() {
            Book bookBorrowed = null;
            if(this.amountOfBooks() > 0){
                bookBorrowed = this.borrowedBooks.remove(0);
            }
            return bookBorrowed;
        }

}
