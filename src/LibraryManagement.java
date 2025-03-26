import java.util.*;
public class LibraryManagement {
        private Map<String, Book> bookCollection = new HashMap<>();

        public void addBook(String id, String title, String author, String genre, String availabilityStatus) {
            if (bookCollection.containsKey(id)) {
                System.out.println("Error: Book with this ID already exists.");
            } else {
                Book newBook = new Book(id, title, author, genre, availabilityStatus);
                bookCollection.put(id, newBook);
                System.out.println("Book added successfully.");
            }
        }

        public void viewAllBooks() {
            if (bookCollection.isEmpty()) {
                System.out.println("No books available.");
            } else {
                for (Book book : bookCollection.values()) {
                    book.displayBookInfo();
                    System.out.println("--------------------------------");
                }
            }
        }


        public void searchBook(String searchTerm) {
            boolean found = false;
            for (Book book : bookCollection.values()) {
                if (book.getId().equalsIgnoreCase(searchTerm) || book.getTitle().equalsIgnoreCase(searchTerm)) {
                    book.displayBookInfo();
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No book found with the given ID or Title.");
            }
        }


        public void updateBook(String id, String title, String author, String genre, String availabilityStatus) {
            if (bookCollection.containsKey(id)) {
                Book bookToUpdate = bookCollection.get(id);
                bookToUpdate.setTitle(title);
                bookToUpdate.setAuthor(author);
                bookToUpdate.setGenre(genre);
                bookToUpdate.setAvailabilityStatus(availabilityStatus);
                System.out.println("Book updated successfully.");
            } else {
                System.out.println("Error: No book found with this ID.");
            }
        }



        public void deleteBook(String id) {
            if (bookCollection.containsKey(id)) {
                bookCollection.remove(id);
                System.out.println("Book deleted successfully.");
            } else {
                System.out.println("Error: No book found with this ID.");
            }
        }
}