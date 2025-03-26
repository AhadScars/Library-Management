import java.util.Scanner;

public class LibrarySystem {
    private static Scanner scanner = new Scanner(System.in);
    private static LibraryManagement library = new LibraryManagement();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    library.viewAllBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    updateBook();
                    break;
                case 5:
                    deleteBook();
                    break;
                case 6:
                    System.out.println("Exiting the system.");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nLibrary System Menu:");
        System.out.println("1. Add a Book");
        System.out.println("2. View All Books");
        System.out.println("3. Search Book by ID or Title");
        System.out.println("4. Update Book Details");
        System.out.println("5. Delete a Book");
        System.out.println("6. Exit System");
        System.out.print("Please choose an option: ");
    }

    private static void addBook() {
        System.out.print("Enter Book ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Book Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Book Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter Availability Status (Available/Checked Out): ");
        String availabilityStatus = scanner.nextLine();

        if (availabilityStatus.equalsIgnoreCase("Available") || availabilityStatus.equalsIgnoreCase("Checked Out")) {
            library.addBook(id, title, author, genre, availabilityStatus);
        } else {
            System.out.println("Invalid Availability Status. Please enter 'Available' or 'Checked Out'.");
        }
    }

    private static void searchBook() {
        System.out.print("Enter Book ID or Title to search: ");
        String searchTerm = scanner.nextLine();
        library.searchBook(searchTerm);
    }

    private static void updateBook() {
        System.out.print("Enter Book ID to update: ");
        String id = scanner.nextLine();
        System.out.print("Enter new Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter new Book Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter new Book Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter new Availability Status (Available/Checked Out): ");
        String availabilityStatus = scanner.nextLine();

        if (availabilityStatus.equalsIgnoreCase("Available") || availabilityStatus.equalsIgnoreCase("Checked Out")) {
            library.updateBook(id, title, author, genre, availabilityStatus);
        } else {
            System.out.println("Invalid Availability Status. Please enter 'Available' or 'Checked Out'.");
        }
    }

    private static void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        String id = scanner.nextLine();
        library.deleteBook(id);
    }
}
