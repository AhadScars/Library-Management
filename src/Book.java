 public class Book {
        private String id;
        private String title;
        private String author;
        private String genre;
        private String availabilityStatus;

        public Book(String id, String title, String author, String genre, String availabilityStatus) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.availabilityStatus = availabilityStatus;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getAvailabilityStatus() {
            return availabilityStatus;
        }

        public void setAvailabilityStatus(String availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
        }


        public void displayBookInfo() {
            System.out.println("Book ID: " + id);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Genre: " + genre);
            System.out.println("Availability Status: " + availabilityStatus);
        }
}
