import java.util.ArrayList;

    public class Library {

        private int capacity;
        private ArrayList<Book> books;

        public Library(int capacity) {
            this.capacity = capacity;
            this.books = new ArrayList<Book>();
        }

        public ArrayList<Book> getBooks() {
            return books;
        }

        public int bookCount() {
            return this.books.size();
        }

        public void addBook(Book book) {
            if (this.bookCount() < this.capacity) {
                this.books.add(book);
            }
        }

        public void removeBook(Book book) {
            this.books.remove(book);
        }

        public void receiveBook(Borrower borrower) {
            if (this.bookCount() < this.capacity) {
                Book borrowedBook = borrower.returnBook();
                this.books.add(borrowedBook);
            }
        }
}
