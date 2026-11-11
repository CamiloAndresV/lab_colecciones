package Colecciones;

public class Main {
    public static void main (String[] args) {
        Material revista = new Revista("123", "nunca", 3, true, 4, "tematica");
        Material libro = new Libro("BK-01", "Cien Años de Soledad", 1967, true, "Gabriel García Márquez", "978-0307474728");
        libro.mostrarInfo();
        revista.mostrarInfo();
    }
}
