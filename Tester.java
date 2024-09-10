package Uzduotis;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tester {



    public static void main(String[] args) {

        ArrayList<Book> result = new ArrayList<>();

        Library collection1 = new Library();
        boolean flag = false;
        String title;
        String author;
        String year;
        String isbn;

        while (flag == false) {
            Scanner ans = new Scanner(System.in);
            System.out.println("What would you like to do? Press the corresponding number");
            System.out.println("System book library");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Search by title");
            System.out.println("4. Search by author");
            System.out.println("5. Display all books");
            System.out.println("6. Exit");
            switch(ans.nextLine()) {
                case "1":
                    System.out.println("Book title: ");
                    title = ans.nextLine();
                    System.out.println("Book author: ");
                    author = ans.nextLine();
                    System.out.println("Book year: ");
                    year = ans.nextLine();
                    System.out.println("Book isbn: ");
                    isbn = ans.nextLine();

                    Book temp = new Book(title, author, year, isbn);
                    temp.setTitle(title);
                    temp.setAuthor(author);
                    temp.setYear(year);
                    temp.setIsbn(isbn);

                    collection1.addBook(temp);
                    break;
                case "2":
                    System.out.println("Which book would you like to remove? (enter the isbn)");
                    String option = ans.nextLine();
                    collection1.removeBook(option);
                case "3":
                    System.out.println("Enter book title: ");
                    title = ans.nextLine();
                    result.add(collection1.searchByTitle(title));
                    break;
            }
         }

    }
}
