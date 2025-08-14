public class LibraryTest {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE LA BIBLIOTECA ===\n");

        Library library = new Library(5);

        Book libro1 = new Book("1984", "George Orwell", "123", true);
        Book libro2 = new Book("Hamlet", "William Shakespeare", "456", true);
        Book libro3 = new Book("El Hobbit", "J.R.R. Tolkien", "789", true);

        library.addBook(libro1);
        library.addBook(libro2);
        library.addBook(libro3);

        library.displayAllBooks();

        System.out.println("--- Buscando libro: '1984' ---");
        Book encontrado = library.searchByTitle("1984");
        if (encontrado != null) {
            System.out.println("Libro encontrado:\n" + encontrado);
        } else {
            System.out.println("No se encontró ese libro.");
        }

        System.out.println("\n--- Eliminando libro con ISBN 456 ---");
        boolean eliminado = library.removeBook("456");
        if (eliminado) {
            System.out.println("Libro eliminado correctamente.");
        } else {
            System.out.println("No se encontró un libro con ese ISBN.");
        }

        library.displayAllBooks();
    }
}
