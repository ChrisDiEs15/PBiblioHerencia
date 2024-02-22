/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamosbiblio;

/**
 *
 * @author Chris
 */
public class Multa extends Prestamo{
    private int costoRetraso=10;
    private int costoDano=100;
    private int costoRepo=1000;
    
    public Multa(int costoRetraso, int costoDano, int costoRepo, String fechaInicio, String fechaFin, String nombre, String autor, String editorial, String codBarras, String id, int numPaginas, int volumen, int edicion, int ano){
        super(fechaInicio, fechaFin, nombre, autor, editorial, codBarras, id, numPaginas, volumen, edicion,ano);
        this.costoRetraso=costoRetraso;
        this.costoDano=costoDano;
        this.costoRepo=costoRepo;
    }

    public void setCostoRetraso(int costoRetraso) {
        this.costoRetraso = costoRetraso;
    }

    public void setCostoDano(int costoDano) {
        this.costoDano = costoDano;
    }

    public void setCostoRepo(int costoRepo) {
        this.costoRepo = costoRepo;
    }

    public int getCostoRetraso() {
        return costoRetraso;
    }

    public int getCostoDano() {
        return costoDano;
    }

    public int getCostoRepo() {
        return costoRepo;
    }
    
    
    
}
