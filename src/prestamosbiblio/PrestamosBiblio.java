/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prestamosbiblio;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

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

                Scanner opcionIN = new Scanner(System.in);
                System.out.println("Cuantos alumnos quiere registrar?");
                int numAlNew = opcionIN.nextInt();
                opcionIN.nextLine(); // Consume newline character

                AlumnoTex[] alumnos = new AlumnoTex[numAlNew];

                for (int i = 0; i < numAlNew; i++) {
                    // Initialize a new list of loans for each student
                    List<Prestamo> prestamos = new ArrayList<>();

                    AlumnoTex nuevoAlMat = new AlumnoTex("", 0, "", "", "", prestamos, "", "", "", "", "", "", "", "");
                    System.out.println("Siga las instrucciones a continuación");
                    nuevoAlMat.registrarEstudiante();

                    // Add alumno to the array
                    alumnos[i] = nuevoAlMat;
                }

                for (AlumnoTex alumno : alumnos) {
                    System.out.println("Información del estudiante registrado:");
                    System.out.println(alumno.getAllInformation());

                    // Print prestamos
                    List<Prestamo> prestamos = alumno.getPrestamos();
                    System.out.println("Prestamos:");
                    for (Prestamo prestamo : prestamos) {
                        System.out.println("Fecha Inicio: " + prestamo.getFechaInicio() + ", Fecha Fin: " + prestamo.getFechaFin());
                        // Print additional loan information if needed
                    }
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

}
