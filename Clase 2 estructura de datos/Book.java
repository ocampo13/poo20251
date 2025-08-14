/**
 * Book Class - Quick Starter
 * Time: 5 minutes
 */
public class Book {
    // Atributos
    private String title;
    private String author;
    private String isbn; // identificador único
    private boolean available;

    // Constructor con los 4 atributos
    public Book(String title, String author, String isbn, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setter para available (prestar/devolver libro)
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // toString para mostrar la info del libro
    @Override
    public String toString() {
        return "Título: " + title + "\nAutor: " + author + 
               "\nISBN: " + isbn + "\nDisponible: " + (available ? "Sí" : "No");
    }
}
