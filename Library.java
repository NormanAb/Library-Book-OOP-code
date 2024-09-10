import java.util.ArrayList;

public class Library {

    public ArrayList<Book> Booklist;

    public Library() {
        Booklist = new ArrayList<>();
    }

    public void addBook (Book book) {
        Booklist.add(book);
    }

    Book removedBook = null;

    public Book removeBook(String isbn) { // coded only on the theoretical basis of 1 isbn unique added into the book list
            boolean found = false;
            for (int i=0; i < Booklist.size(); i++) {
                if (Booklist.get(i).getIsbn().equals(isbn)) {
                    removedBook = Booklist.get(i);
                    Booklist.remove(i); //this is an array of objects, not an object itself, so use index element
                    found = true;
                    break;
            }
        }
        if (!found) System.out.println("There is no such isbn in the list");
        return removedBook;
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> result = new ArrayList<>();
        for (int i=0; i<Booklist.size(); i++) {
            if (Booklist.get(i).getTitle().equals(title)) {
                result.add(Booklist.get(i));
            }
        }
        return result; //Result is just an array, not an object, and we can't just return an array when we defined the variable type to be book, we must change it to array of the book class!!!
    }

    public ArrayList<Book> searchByAuthor(String author) { //copy searchByTitle, similar algorithm
        ArrayList<Book> result = new ArrayList<>();
        for (int i=0; i<Booklist.size(); i++) {
            if (Booklist.get(i).getAuthor().equals(author)) {
                result.add(Booklist.get(i));
            }
        }
        return result;
    }

    public void displayAllBooks() {
        for (int i=0; i<Booklist.size(); i++) {
            Booklist.get(i);
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "Booklist=" + Booklist +
                '}';
    }
}
