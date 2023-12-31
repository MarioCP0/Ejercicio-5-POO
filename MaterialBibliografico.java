import java.util.*;

public abstract class MaterialBibliografico{
    protected String nombre;
    protected String editorial;
    protected int añoPublicacion;
    protected String genero;
    protected String autor;

    public MaterialBibliografico(String nombre, String editorial, int añoPublicacion, String genero, String autor){
        this.nombre = nombre;
        this.editorial = editorial;
        this.añoPublicacion = añoPublicacion;
        this.genero = genero;
        this.autor = autor;
    }
    

    public abstract String generarReferenciaAPA();

    //Getters y setters para los atributos
    public String getNombre(){
        return nombre;
    } 

    public String getEditorial(){
        return editorial;
    }

    public int getAñoPublicacion(){
        return añoPublicacion;
    }
    
    public String getGenero(){
        return genero;
    }

    public String getAutor(){
        return autor;
    }
}