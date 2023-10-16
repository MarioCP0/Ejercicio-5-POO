public class Libro extends MaterialBibliografico {
    public Libro(String nombre, String editorial, int añoPublicacion, String genero, String autor) {
        super(nombre, editorial, añoPublicacion, genero, autor);
    }

    @Override
    public String generarReferenciaAPA() {
        // Implementación específica para Libro
        return autor + " (" + añoPublicacion + "). " + nombre + ". " + editorial + ".";
    }
}