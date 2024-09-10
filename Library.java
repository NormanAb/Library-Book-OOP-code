package Uzduotis;


import java.util.ArrayList;

public class Library {

    private ArrayList<Book> Booklist;

    public Library() {
        Booklist = new ArrayList<>();
    }

    public void addBook (Book book) {
        Booklist.add(book);
    }

    public void removeBook(String isbn) {
        for (int i=0; i<Booklist.size(); i++) {
            if (Booklist.get(i).getIsbn().equals(isbn)) {
                Booklist.remove(Booklist.get(i));
            }
        }
    }

    public Book searchByTitle(String title) {
        ArrayList<Book> result = new ArrayList<>();
        for (int i=0; i<Booklist.size(); i++) {
            if (Booklist.get(i).getTitle().equals(title)) result.add(Booklist.get(i));

        }
        return result;
    }

    public void searchByAuthor(String author) {
        for (int i=0; i<Booklist.size(); i++) {
            if (Booklist.get(i).getAuthor().equals(author)) Booklist.get(i);
        }
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
