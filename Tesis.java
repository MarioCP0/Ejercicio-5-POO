public class Tesis extends MaterialBibliografico {
    public Tesis(String nombre, String editorial, int añoPublicacion, String genero, String autor) {
        super(nombre, editorial, añoPublicacion, genero, autor);
    }

    @Override
    public String generarReferenciaAPA(){
        return autor + " (" + añoPublicacion + "). " + nombre + " (Tesis de maestría). " + editorial + ".";
    }
}