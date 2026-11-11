package Colecciones;

public class Main {
    public static void main (String[] args) {

        SistemaBiblioteca biblioteca = new SistemaBiblioteca();

        System.out.println("=== 1. PRUEBA DEL CATÁLOGO (HashMap) ===");
        Material revista = new Revista("123", "nunca", 3, true, 4, "tematica");
        Material libro = new Libro("BK-01", "Cien Años de Soledad", 1967, true, "Gabriel García Márquez", "978-0307474728");
        biblioteca.registrarMaterial(revista);
        biblioteca.registrarMaterial(libro);
        //libro.mostrarInfo();
        //revista.mostrarInfo();
        biblioteca.mostrarCatalogo();

        System.out.println("\n--- Búsqueda de materiales ---");
        Material buscando = biblioteca.buscarMaterial("BK-01");
        if (buscando != null) {
            System.out.println("Encontrado: ");
            buscando.mostrarInfo();
        }

        Material noEsta = biblioteca.buscarMaterial("1234");
        System.out.println("\ncodigo no existente "+noEsta);

        System.out.println("\n=== 2. PRUEBA DE LISTA DE ESPERA (ArrayList) ===");
        biblioteca.agregarEspera("BK-01", "camilo");
        biblioteca.agregarEspera("BK-01", "Daniela");
        biblioteca.agregarEspera("BK-01", "Juan");

        System.out.println("siguiente en entregar libro BK-01" + biblioteca.siguienteEnEspera("BK-01"));
        System.out.println("siguiente en entregar libro BK-01" + biblioteca.siguienteEnEspera("BK-01"));
        System.out.println("siguiente en entregar libro BK-01" + biblioteca.siguienteEnEspera("BK-01"));

        System.out.println("\n=== 3. PRUEBA DE MEMBRESÍAS (HashSet) ===");
        System.out.println("Registrar a Juan" + biblioteca.registrarMiembro("Juan"));
        System.out.println("Registrar a Camilo" + biblioteca.registrarMiembro("Camilo"));

        System.out.println("intentando registrar a 'camilo' otra vez" + biblioteca.registrarMiembro("Camilo"));

        System.out.println("¿Camilo tiene miembro? " + biblioteca.tieneMembresia("Camilo"));
        System.out.println("¿Juan tiene miembro? " + biblioteca.tieneMembresia("Juan"));
        System.out.println("¿Daniela tiene miembro? " + biblioteca.tieneMembresia("Daniela"));

    }
}
