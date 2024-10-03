/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidadGP13;

import java.time.LocalDate;
import java.time.Month;
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
        // TODO code application logic here
        Alumno alu = new Alumno (4,39990826,"Muñoz","Pedro",LocalDate.of(1996,11,14),true);
        AlumnoData alumno1 = new AlumnoData();
        //alumno1.guardarAlumno(alu);
        //alumno1.modificarAlumno(alu);
        //alumno1.eliminarAlumno(alu.getIdAlumno());
//---Busqueda por id(Si el alumno no existe fisicamente o esta en estado de baja lanzara un nullpointerExpetion por el metodo toString)---
        //Alumno alumnoEncontrado=alumno1.buscarAlumnoporid(1);
        //System.out.println(alumnoEncontrado.toString());
//---Busqueda por dni(Si el alumno no existe fisicamente o esta en estado de baja lanzara un nullpointerExpetion por el metodo toString)---
        //Alumno alumnoEncontrado=alumno1.buscarAlumnopordni(39990823);
        //System.out.println(alumnoEncontrado.toString());
        for(Alumno alumno:alumno1.listarAlumnos()){
            System.out.println("DNI: "+alumno.getDni());
            System.out.println("Apellido: "+alumno.getApellido());
            System.out.println("Nombre: "+alumno.getNombre());
            System.out.println("Fecha de nacimiento: "+alumno.getFechaNac());
        }
    }
    
}
