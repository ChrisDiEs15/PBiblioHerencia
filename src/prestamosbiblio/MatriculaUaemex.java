/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamosbiblio;

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
    
/*methods may be in Alumno and academico*/
    /*retrieve information 
    The principal operations on a StringBuilder are the append and insert methods, which are overloaded so as to accept data of any type. Each effectively converts a given datum to a string and then appends or inserts the characters of that string to the string builder. The append method always adds these characters at the end of the builder; the insert method adds the characters at a specified point.
 */
    public String getAllInformation() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nombre: ").append(getNombre()).append("\n");
        builder.append("Apellido Paterno: ").append(getaPaterno()).append("\n");
        builder.append("Apellido Materno: ").append(getaMaterno()).append("\n");
        builder.append("Email: ").append(getEmail()).append("\n");
        builder.append("Dirección: ").append(getDireccion()).append("\n");
        builder.append("CURP: ").append(getCurp()).append("\n");
        builder.append("Teléfono: ").append(getTelefono()).append("\n");
        builder.append("ID: ").append(getId()).append("\n");
        return builder.toString();
    }
    
}
