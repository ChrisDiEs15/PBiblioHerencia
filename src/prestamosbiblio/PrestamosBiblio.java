/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prestamosbiblio;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class PrestamosBiblio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Bienvenido al programa 
        Scanner opcion =new Scanner(System.in);
        System.out.println("Bienvenido al programa para registrar prestamos de la biblioteca");
        System.out.println("A continuacion se le pedira dar de alta al usuario como empleado o estudiante");
        System.out.println("Por favor elija una de las opciones");
        System.out.println("1.-Estudiantes");
        System.out.println("2.-Academicos");
        int opcionIn=opcion.nextInt();
        
        switch(opcionIn){
            
            case 1->{
                /*init new instance of alumnoTex*/
                AlumnoTex nuevoAlMat = new AlumnoTex("",0,"","","","","","","","","","","");
                System.out.println("Siga las instrucciones a continuacion");
                /*init registro*/
                nuevoAlMat.registrarEstudiante();
                /*when finishes return all information*/
                String allInfo = nuevoAlMat.getAllInformation();
                System.out.println("la informacion que se ha registrado es la siguiente");
                System.out.println(allInfo);
            }
            case 2->{
                System.out.println("Siga las instrucciones a continuacion");
            
            }
        }
    }
    
}
