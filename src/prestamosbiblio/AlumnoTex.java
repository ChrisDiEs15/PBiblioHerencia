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
public class AlumnoTex extends MatriculaUaemex {
    /*Add info for Alumnos*/
    private String matricula;
    private int semestre;
    private String carrera;
    private String grupo;
    private String tiempo;
    
    /*constructor*/
    public AlumnoTex( String matricula, int semestre, String carrera, String grupo, String tiempo, String nombre, String aPaterno, String aMaterno, String email, String direccion, String curp, String telefono, String id){
        super(nombre, aPaterno, aMaterno, email, direccion, curp, telefono, id);
        this.matricula=matricula;
        this.semestre=semestre;
        this.carrera=carrera;
        this.grupo=grupo;
        this.tiempo=tiempo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getSemestre() {
        return semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getTiempo() {
        return tiempo;
    }
    
    public void registrarEstudiante() {
        /*first call to the super*/
        MatriculaUaemex getSupInfo= alta();
        /*if writes getsupInfo continue with the registration*/
        if(getSupInfo != null){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la matrícula del estudiante:");
        String matriculaIn = scanner.nextLine();
        
        System.out.println("Ingrese el semestre:");
        int semestreIn = scanner.nextInt();
        
        System.out.println("Ingrese la carrera:");
        scanner.nextLine(); // Consume newline character
        String carreraIn = scanner.nextLine();
        
        System.out.println("Ingrese el grupo:");
        String grupoIn = scanner.nextLine();
        
        System.out.println("Ingrese el tiempo:");
        String tiempoIn = scanner.nextLine();
        
        // Set additional information
        setMatricula(matriculaIn);
        setSemestre(semestreIn);
        setCarrera(carreraIn);
        setGrupo(grupoIn);
        setTiempo(tiempoIn);}
    }
    
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
        builder.append("Matrícula: ").append(matricula).append("\n");
        builder.append("Semestre: ").append(semestre).append("\n");
        builder.append("Carrera: ").append(carrera).append("\n");
        builder.append("Grupo: ").append(grupo).append("\n");
        builder.append("Tiempo: ").append(tiempo).append("\n");
        return builder.toString();
    }
    
}
