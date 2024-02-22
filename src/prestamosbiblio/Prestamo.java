/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamosbiblio;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class Prestamo extends Libro {

    private String fechaInicio;
    private String fechaFin;

    public Prestamo(String fechaInicio, String fechaFin, String nombre, String autor, String editorial, String codBarras, String id, int numPaginas, int volumen, int edicion, int ano) {
        super(nombre, autor, editorial, codBarras, id, numPaginas, volumen, edicion, ano);
        this.fechaFin = fechaFin;
        this.fechaInicio = fechaInicio;
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

    public void RegNuPrestamo() {
        Scanner prestamo = new Scanner(System.in);
        System.out.println("A continuación registre los datos del libro:");
        System.out.println("Nombre del Libro:");
        String nombreIn = prestamo.nextLine();
        System.out.println("Autor:");
        String autorIn = prestamo.nextLine();
        System.out.println("Editorial:");
        String editorialIn = prestamo.nextLine();
        System.out.println("Cod. Barras:");
        String codigoBarrasIn = prestamo.nextLine();
        System.out.println("ID:");
        String idIn = prestamo.nextLine();
        System.out.println("Número de páginas:");
        int numPaginasIn = prestamo.nextInt();
        System.out.println("Volumen:");
        int volumenIn = prestamo.nextInt();
        System.out.println("Edición:");
        int edicionIn = prestamo.nextInt();
        System.out.println("Año:");
        int anoIn = prestamo.nextInt();

        // Consume the newline character
        prestamo.nextLine();

        System.out.println("Fecha Inicio:");
        String fechaInicioIn = prestamo.nextLine();
        System.out.println("Fecha Fin:");
        String fechaFinIn = prestamo.nextLine();

        // Setting Info
        setNombre(nombreIn);
        setAutor(autorIn);
        setEditorial(editorialIn);
        setCodBarras(codigoBarrasIn);
        setId(idIn);
        setNumPaginas(numPaginasIn);
        setVolumen(volumenIn);
        setEdicion(edicionIn);
        setAno(anoIn);
        setFechaInicio(fechaInicioIn);
        setFechaFin(fechaFinIn);
    }

}
