public class DVD extends MaterialBibliografico {
    public DVD(String nombre, String editorial, int añoPublicacion, String genero, String autor) {
        super(nombre, editorial, añoPublicacion, genero, autor);
    }

    @Override
    public String generarReferenciaAPA(){
        return autor + "(" + añoPublicacion + "). " + nombre + "[DVD]. " + editorial + ".";
    }
}