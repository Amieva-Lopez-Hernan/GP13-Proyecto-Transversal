/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidadGP13;

import java.time.LocalDate;
import universidadGP13.accesoAdatos.AlumnoData;
import universidadGP13.entidades.Alumno;

/**
 *
 * @author Hernan
 */
public class GP13ProyectoTransversal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alu = new Alumno (4,39990826,"Muñoz","Pedro",LocalDate.of(1996,11,14),true);
        AlumnoData alumno1 = new AlumnoData();
//        alumno1.guardarAlumno(alu);
//        alumno1.modificarAlumno(alu);
//        alumno1.eliminarAlumno(alu.getIdAlumno());
//        Alumno alumnoEncontrado=alumno1.buscarAlumnoporid(1);
//        if (alumnoEncontrado!=null) {
//            System.out.println(alumnoEncontrado.toString());
//        }
        Alumno alumnoEncontrado=alumno1.buscarAlumnopordni(39990823);
        if (alumnoEncontrado!=null) {
            System.out.println(alumnoEncontrado.toString());
        }
//        for(Alumno alumno:alumno1.listarAlumnos()){
//            System.out.println("DNI: "+alumno.getDni());
//            System.out.println("Apellido: "+alumno.getApellido());
//            System.out.println("Nombre: "+alumno.getNombre());
//            System.out.println("Fecha de nacimiento: "+alumno.getFechaNac());
//        }
    }
    
}
