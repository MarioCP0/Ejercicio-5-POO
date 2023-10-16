public class Periodico extends MaterialBibliografico {
    public Periodico(String nombre, String editorial, int añoPublicacion, String genero, String autor) {
        super(nombre, editorial, añoPublicacion, genero, autor);
    }

    @Override
    public String generarReferenciaAPA(){
        return autor + " (" + añoPublicacion + "). " + nombre + ". " + editorial + ".";
    }
}