/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamosbiblio;

/**
 *
 * @author Chris
 */
public class Libro {
    private String autor, editorial, codBarras, id;
    private int numPaginas, volumen, edicion, ano;
    
    public Libro(String autor, String editorial, String codBarras, String id, int numPaginas, int volumen, int edicion, int ano){
       this.autor=autor;
       this.editorial=editorial;
       this.codBarras=codBarras;
       this.id=id;
       this.numPaginas=numPaginas;
       this.volumen=volumen;
       this.edicion=edicion;
       this.ano=ano;    
    
    }
    
    /*getters*/

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public String getId() {
        return id;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public int getVolumen() {
        return volumen;
    }

    public int getEdicion() {
        return edicion;
    }

    public int getAno() {
        return ano;
    }
/*setters*/

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
