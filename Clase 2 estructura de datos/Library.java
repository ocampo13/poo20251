/**
 * Library Class - Core Methods Only
 * Time: 20 minutes
 */
public class Library {
    private Book[] books;
    private int bookCount;  // Lleva el conteo de cuántos libros hay realmente en la biblioteca
    
    // Constructor
    public Library(int capacity) {
        books = new Book[capacity]; // inicializa el array con el tamaño indicado
        bookCount = 0; // no hay libros al inicio
        System.out.println("Library created with capacity: " + capacity);
    }
    
    /**
     * Method 1: Search for a book by title
     */
    public Book searchByTitle(String title) {
        for (int i = 0; i < bookCount; i++) { // solo revisamos libros ocupados
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null; // no encontrado
    }
    
    /**
     * Method 2: Add a new book
     */
    public boolean addBook(Book book) {
        if (book == null || isFull()) {
            return false; // no se puede añadir si está lleno o el libro es nulo
        }
        books[bookCount] = book;
        bookCount++;
        System.out.println("Book added: " + book.getTitle());
        return true;
    }
    
    /**
     * Method 3: Remove a book by ISBN
     */
    public boolean removeBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                // desplazamos los demás libros a la izquierda
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[bookCount - 1] = null; // limpiamos la última posición
                bookCount--;
                System.out.println("Book removed: " + isbn);
                return true;
            }
        }
        return false; // no encontrado
    }
    
    /**
     * Method 4: Display all books
     */
    public void displayAllBooks() {
        System.out.println("\n=== LIBRARY (" + bookCount + "/" + books.length + " books) ===");
        if (bookCount == 0) {
            System.out.println("Library is empty");
        } else {
            for (int i = 0; i < bookCount; i++) {
                System.out.println(books[i].toString());
                System.out.println("-----------------");
            }
        }
        System.out.println("=================\n");
    }
    
    // Quick helper methods
    public boolean isEmpty() {
        return bookCount == 0;
    }
    
    public boolean isFull() {
        return bookCount >= books.length;
    }
}
