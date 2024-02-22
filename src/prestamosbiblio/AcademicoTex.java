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
public class AcademicoTex extends MatriculaUaemex {
    /*add academico informatiion*/
    private String numEmpleado;
    private String departamento;
    private String tiempoContratado;
    
    public AcademicoTex(String numEmpleado, String departamento, String tiempoContratado, String nombre, String aPaterno, String aMaterno, String email, String direccion, String curp, String telefono, String id){
    super(nombre, aPaterno, aMaterno, email, direccion, curp, telefono, id);
    this.numEmpleado=numEmpleado;
    this.departamento=departamento;
    this.tiempoContratado=tiempoContratado;
    
    }
/*getters*/
    public String getNumEmpleado() {
        return numEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getTiempoContratado() {
        return tiempoContratado;
    }
    /*setters*/

    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setTiempoContratado(String tiempoContratado) {
        this.tiempoContratado = tiempoContratado;
    }
    
    public void registrarAcademico(){
    MatriculaUaemex getSupInfo= alta();
    if(getSupInfo != null){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el numero de empleado:");
        String numEmpleadoIn = scanner.nextLine();
        
        System.out.println("Ingrese el departamento:");
        String departamentoIn = scanner.nextLine();
        
        System.out.println("Ingrese el tiempo contratado:");
        scanner.nextLine(); // Consume newline character
        String turnoIn = scanner.nextLine();
        
        /*Setting the info in academico*/
        setNumEmpleado(numEmpleadoIn);
        setDepartamento(departamentoIn);
        setTiempoContratado(turnoIn);
    }
    
    }
    
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
        builder.append("Num. Epmleado: ").append(numEmpleado).append("\n");
        builder.append("Departamento: ").append(departamento).append("\n");
        builder.append("Carrera: ").append(tiempoContratado).append("\n");
        return builder.toString();
    }
    
}

