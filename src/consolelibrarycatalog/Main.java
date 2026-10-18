package consolelibrarycatalog;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void displayMenu() {
        System.out.println("==== Menu ====");
        System.out.println("1. Add Book");
        System.out.println("2. Add DVD");
        System.out.println("3. Add Magazine");
        System.out.println("4. List all");
        System.out.println("5. Search by title");
        System.out.println("6. Remove item");
        System.out.println("7. Count items");
        System.out.println("8. Exit");
    }

    public static void handleAddBook(Scanner scan, Library library) {
        System.out.print("Enter book id: ");
        int id = scan.nextInt();
        scan.nextLine();                       // eat leftover newline

        System.out.print("Enter title: ");
        String title = scan.nextLine();

        System.out.print("Enter year: ");
        int year = scan.nextInt();
        scan.nextLine();                       // eat leftover newline

        System.out.print("Enter author: ");
        String author = scan.nextLine();

        System.out.print("Enter ISBN: ");
        String isbn = scan.nextLine();

        Book book = new Book(id, title, year, author, isbn);
        library.addItem(book);
        System.out.println("Book added.");
    }

    public static void handleAddDVD(Scanner scan, Library library) {
        System.out.print("Enter DVD id: ");
        int id = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter title: ");
        String title = scan.nextLine();

        System.out.print("Enter year: ");
        int year = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter director: ");
        String director = scan.nextLine();

        System.out.print("Enter duration (minutes): ");
        int durationMinutes = scan.nextInt();
        scan.nextLine();

        DVD dvd = new DVD(id, title, year, director, durationMinutes);
        library.addItem(dvd);
        System.out.println("DVD added.");
    }

    public static void handleAddMagazine(Scanner scan, Library library) {
        System.out.print("Enter magazine id: ");
        int id = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter title: ");
        String title = scan.nextLine();

        System.out.print("Enter year: ");
        int year = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter issue number: ");
        int issueNumber = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter publisher: ");
        String publisher = scan.nextLine();

        Magazine magazine = new Magazine(id, title, year, issueNumber, publisher);
        library.addItem(magazine);
        System.out.println("Magazine added.");
    }

    public static void handleRemoveItem(Scanner scan, Library library) {
        System.out.print("Enter the id to remove: ");
        int id = scan.nextInt();
        scan.nextLine();

        library.removeItem(id);
    }

    public static void handleListAll(Library library) {
        library.listAllItems();
    }

    public static void handleSearchByTitle(Scanner scan, Library library) {
        System.out.print("Enter the title: ");
        String title = scan.nextLine();

        List<LibraryItem> results = library.findItemsByTitle(title);

        if (results.isEmpty()) {
            System.out.println("No matches.");
        } else {
            library.printItems(results);
        }
    }

    public static void handleCount(Library library) {
        System.out.println("Total items: " + library.countItems());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Library library = new Library();       // ONE library for the whole run

        while (true) {
            System.out.println();
            displayMenu();
            System.out.print("Choose an option: ");
            int choice = scan.nextInt();
            scan.nextLine();                   // eat leftover newline

            switch (choice) {
                case 1:
                    handleAddBook(scan, library);
                    break;
                case 2:
                    handleAddDVD(scan, library);
                    break;
                case 3:
                    handleAddMagazine(scan, library);
                    break;
                case 4:
                    handleListAll(library);
                    break;
                case 5:
                    handleSearchByTitle(scan, library);
                    break;
                case 6:
                    handleRemoveItem(scan, library);
                    break;
                case 7:
                    handleCount(library);
                    break;
                case 8:
                    System.out.println("Goodbye.");
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
