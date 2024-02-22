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
        Scanner opcion = new Scanner(System.in);
        System.out.println("Bienvenido al programa para registrar prestamos de la biblioteca");
        System.out.println("A continuacion se le pediran la informacion para el prestamo");
        System.out.println("Por favor elija una de las opciones de prestamo:");
        System.out.println("1.-Estudiantes");
        System.out.println("2.-Academicos");
        int opcionIn = opcion.nextInt();

        switch (opcionIn) {

            case 1 -> {
                System.out.println("Cuantos alumnos quiere registar?");
                int numAlNew = opcion.nextInt();
                AlumnoTex[] alumnos = new AlumnoTex[numAlNew];
                for (int i = 0; i < numAlNew; i++) {
                    
                    AlumnoTex nuevoAlMat = new AlumnoTex("", 0, "", "", "", "", "", "", "", "", "", "", "");
                    System.out.println("Siga las instrucciones a continuación");
                    nuevoAlMat.registrarEstudiante();

                    // Add alumno to the array
                    alumnos[i] = nuevoAlMat;
                }
            }
            case 2 -> {
                /*init academico*/
                AcademicoTex nuevoAcMat = new AcademicoTex("", "", "", "", "", "", "", "", "", "", "");
                System.out.println("Siga las instrucciones a continuacion");
                /*init Registro*/
                nuevoAcMat.registrarAcademico();
                /*when finishes return all information*/
                String allInfo = nuevoAcMat.getAllInformation();
                System.out.println("la informacion que se ha registrado es la siguiente");
                System.out.println(allInfo);

            }
        }
    }

    public void WriteInfo(int numDeRegistros, Object Registros ){
    
    
    }
}
