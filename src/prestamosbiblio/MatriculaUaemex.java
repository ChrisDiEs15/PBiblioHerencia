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
public class MatriculaUaemex {
    private String nombre, aPaterno, aMaterno, email, direccion, curp, telefono, id;
    
    public MatriculaUaemex(String nombre, String aPaterno, String aMaterno, String email, String direccion, String curp, String telefono, String id){
        this.nombre=nombre;
        this.aPaterno=aPaterno;
        this.aMaterno=aMaterno;
        this.email=email;
        this.direccion=direccion;
        this.curp=curp;
        this.telefono=telefono;
        this.id=id;
        
    }
    /*getters*/

    public String getNombre() {
        return nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCurp() {
        return curp;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getId() {
        return id;
    }
    /*setters*/

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public MatriculaUaemex alta(){
        Scanner altaNueva =new Scanner(System.in);
        System.out.println("A continuacion Inserte los campos requeridos");
        System.out.println("Nombre");
        String nombreNuevo = altaNueva.nextLine();
        System.out.println("Apellido Paterno");
        String aPaternoNuevo = altaNueva.nextLine();
        System.out.println("Apellido Materno");
        String aMaternoNuevo = altaNueva.nextLine();
        System.out.println("Email");
        String emailNuevo = altaNueva.nextLine();
        System.out.println("Direccion");
        String direccionNuevo = altaNueva.nextLine();
        System.out.println("CURP");
        String curpNuevo = altaNueva.nextLine();
        System.out.println("Telefono");
        String telefonoNuevo = altaNueva.nextLine();
        /*Id requires automatically add*/
        /*Artifact for return an user*/       
        return new MatriculaUaemex(nombreNuevo, aPaternoNuevo, aMaternoNuevo, emailNuevo, direccionNuevo, curpNuevo, telefonoNuevo, id);
    
    }
    
    public void baja(){
        Scanner bajaNueva = new Scanner(System.in);
        System.out.println("Escriba el CURP de la persona que desea dar de baja");
        /*need to Capitalize?*/
        String curpBaja = bajaNueva.nextLine();
        /*Seacrh Curp??*/
        String busquedaNueva=getCurp();
    
    }
    
    public void editar(){
    Scanner editarNuevo=new Scanner(System.in);
        System.out.println("Escriba el curp de la persona que desea editar");
        /*need to Capitalize?*/
        String curpEdicion = editarNuevo.nextLine();
        /*Seacrh Curp??*/
        String busquedaEditNueva=getCurp();
        /*when found via curp shows select options to edit like nombre, etc. */
        
    
    }
    
}
