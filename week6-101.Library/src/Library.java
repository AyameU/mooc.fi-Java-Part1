import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.books.add(newBook);
    }

    public void printBooks() {
        for(Book book : books) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String searchedTitle) {
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book book : books) {
            if(StringUtils.included(book.title(), searchedTitle)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String searchedPublisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book book : books) {
            if(StringUtils.included(book.publisher(), searchedPublisher)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book book : books) {
            if(book.year() == (year)) {
                found.add(book);
            }
        }
        return found;
    }
}
