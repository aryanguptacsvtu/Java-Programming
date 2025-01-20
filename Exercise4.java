// LIBRARY MANAGEMENT SYSTEM :-
import java.util.Scanner;

class Library {
    String[] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {

        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    void showAvailableBooks() {

        System.out.println("Available Books are:-");

        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("** " + book);
        }
    }

    void issueBook(String book) {

        for (int i = 0; i < this.books.length; i++) {

            if (this.books[i] != null && this.books[i].equals(book)) {
                
                System.out.println("The book " + book + " has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("The book does not exist.");
    }

    void returnBook(String book) {

        addBook(book);
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("\n---Welcome to Central Library---");
                System.out.println("1. Add Book");
                System.out.println("2. Issue Book");
                System.out.println("3. Return Book");
                System.out.println("4. Show Available Books");
                System.out.println("5. Exit");

                System.out.print("\nEnter your choice :");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter the book name you want to ADD :");
                        sc.nextLine(); // Consume newline
                        String bookName = sc.nextLine();
                        centralLibrary.addBook(bookName);
                    }

                    case 2 -> {
                        System.out.print("Enter the book name you want to ISSUE :");
                        sc.nextLine(); // Consume newline
                        String issueBook = sc.nextLine();
                        centralLibrary.issueBook(issueBook);
                    }

                    case 3 -> {
                        System.out.print("Enter the book name you want to RETURN :");
                        sc.nextLine(); // Consume newline
                        String returnBook = sc.nextLine();
                        centralLibrary.returnBook(returnBook);
                    }

                    case 4 ->
                        centralLibrary.showAvailableBooks();

                    case 5 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("INVALID CHOICE!!");
                }

            } while (true);
        }

    }

}
