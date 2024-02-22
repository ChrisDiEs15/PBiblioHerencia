/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamosbiblio;

/**
 *
 * @author Chris
 */
public class Prestamo extends Libro {
    private String fechaInicio;
    private String fechaFin;
    public Prestamo(String fechaInicio, String fechaFin, String autor, String editorial, String codBarras, String id, int numPaginas, int volumen, int edicion, int ano){
        super(autor, editorial, codBarras, id,  numPaginas, volumen, edicion, ano);
    this.fechaFin=fechaFin;
    this.fechaInicio=fechaInicio;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
    
}
