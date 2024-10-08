/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidadGP13;

import java.time.LocalDate;
import universidadGP13.accesoAdatos.AlumnoData;
import universidadGP13.accesoAdatos.MateriaData;
import universidadGP13.entidades.Alumno;
import universidadGP13.entidades.Materia;

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
        Materia materia1 = new Materia (12,"Matematicas",2,true);
        MateriaData mat = new MateriaData();
//        alumno1.guardarAlumno(alu);
//        alumno1.modificarAlumno(alu);
//        alumno1.eliminarAlumno(alu.getIdAlumno());
//        Alumno alumnoEncontrado=alumno1.buscarAlumnoporid(1);
//        if (alumnoEncontrado!=null) {
//            System.out.println(alumnoEncontrado.toString());
//        }
//        Alumno alumnoEncontrado=alumno1.buscarAlumnopordni(39990823);
//        if (alumnoEncontrado!=null) {
//            System.out.println(alumnoEncontrado.toString());
//        }
//        for(Alumno alumno:alumno1.listarAlumnos()){
//            System.out.println("DNI: "+alumno.getDni());
//            System.out.println("Apellido: "+alumno.getApellido());
//            System.out.println("Nombre: "+alumno.getNombre());
//            System.out.println("Fecha de nacimiento: "+alumno.getFechaNac());
//        }
//        mat.guardarMateria(materia1);
//        mat.modificarMateria(materia1);
//        mat.eliminarMateria(1);
//        Materia materiaEncontrada=mat.buscarMateria(1);
//        if (materiaEncontrada!=null) {
//            System.out.println(materiaEncontrada.toString());
//        }
//        Materia materiaEncontrada2=mat.buscarMateria(2);
//        if (materiaEncontrada!=null) {
//            System.out.println(materiaEncontrada2.toString());
//        }
//        for(Materia materia:mat.listarMaterias()){
//            System.out.println("ID: " + materia.getIdMateria());
//            System.out.println("Materia: " + materia.getNombre());
//            System.out.println("Año en que se cursa: " + materia.getAnioMateria());
//        }
    }
    
}
