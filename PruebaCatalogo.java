import java.util.Map;

public class PruebaCatalogo {
    public static void main(String[] args) {
        // Crear un catálogo
        Catalogo catalogo = new Catalogo();

        // Crear algunos materiales bibliográficos
        Libro libro = new Libro("El discurso del método", "Editorial Gredos", 1630, "Filosofía", "Rene Descartes");
        DVD dvd = new DVD("El Padrino", "Paramount Pictures", 1972, "Drama", "Francis Ford Coppola");
        Periodico periodico = new Periodico("The New York Times", "The New York Times Company", 2023, "Noticias", "A. G. Sulzberger");
        Tesis tesis = new Tesis("La influencia de la tecnología en la educación", "Universidad de Guatemala", 2023, "Educación", "Juan Pérez");
        ArticuloCientifico articulo = new ArticuloCientifico("Avances en la investigación del cáncer", "Nature Medicine", 2023, "Medicina", "Ana López");

        // Agregar los materiales al catálogo
        catalogo.agregarMaterial(libro);
        catalogo.agregarMaterial(dvd);
        catalogo.agregarMaterial(periodico);
        catalogo.agregarMaterial(tesis);
        catalogo.agregarMaterial(articulo);

        // Contar materiales por año
        System.out.println("\nConteo por año:");
        Map<Integer, Integer> conteoPorAño = catalogo.contarMaterialesPorAño();
        for (Map.Entry<Integer, Integer> entry : conteoPorAño.entrySet()) {
            System.out.println("Año: " + entry.getKey() + ", Cantidad: " + entry.getValue());
        }

        // Contar materiales por género
        System.out.println("\nConteo por género:");
        Map<String, Integer> conteoPorGenero = catalogo.contarMaterialesPorGenero();
        for (Map.Entry<String, Integer> entry : conteoPorGenero.entrySet()) {
            System.out.println("Género: " + entry.getKey() + ", Cantidad: " + entry.getValue());
        }
    }
}
