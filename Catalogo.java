import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Catalogo {
    private List<MaterialBibliografico> listaMateriales;
    public Catalogo(){
        this.listaMateriales = new ArrayList<>();
    }

    public void agregarMaterial(MaterialBibliografico material){
        listaMateriales.add(material);
    }
    public Map<String, Integer> contarMaterialesPorGenero(){
        Map<String, Integer> conteoPorGenero = new HashMap<>();
        for (MaterialBibliografico material : listaMateriales){
            conteoPorGenero.put(material.getGenero(),
            conteoPorGenero.getOrDefault(material.getGenero(), 0) + 1);
        }
        return conteoPorGenero;
    }

    public Map<String, Integer> contarMaterialesPorAutor(){
        Map<String, Integer> conteoPorAutor = new HashMap<>();
        for (MaterialBibliografico material : listaMateriales){
            conteoPorAutor.put(material.getAutor(),
            conteoPorAutor.getOrDefault(material.getAutor(), 0) + 1);
        }
        return conteoPorAutor;
    }

    public Map<Integer, Integer> contarMaterialesPorAño(){
        Map<Integer, Integer> conteoPorAño = new HashMap<>();
        for (MaterialBibliografico material : listaMateriales){
            conteoPorAño.put(material.getAñoPublicacion(),
            conteoPorAño.getOrDefault(material.getAñoPublicacion(), 0) + 1);
        }
        return conteoPorAño;
    }

    public void mostrarCatalogo() { 
    for (MaterialBibliografico material : listaMateriales){
        System.out.println(material.generarReferenciaAPA());
    }
}

}