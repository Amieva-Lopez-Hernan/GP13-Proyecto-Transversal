/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadGP13.accesoAdatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadGP13.entidades.Alumno;
import universidadGP13.entidades.Inscripcion;
import universidadGP13.entidades.Materia;

/**
 *
 * @author Hernan
 */
public class InscripcionData {

    private Connection conn = null;
    private MateriaData md = new MateriaData();
    private AlumnoData ad = new AlumnoData();

    public InscripcionData() {
        conn = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion ins) {
        String sql = "INSERT INTO inscripcion(id_alumno, id_materia, nota) VALUES (?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ins.getAlumno().getIdAlumno());
            ps.setInt(2, ins.getMateria().getIdMateria());
            ps.setDouble(3, ins.getNota());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                ins.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion guardada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
    }

    public void actualizarNota(int idAlu, int idMat, double nota) {
        String sql = "UPDATE inscripcion SET nota = ? WHERE id_alumno = ? and id_materia = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlu);
            ps.setInt(3, idMat);
            int rs = ps.executeUpdate();
            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Nota actualizada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
    }

    public void borrarInscripcionMateriaAlumno(int idAlu, int idMat) {
        String sql = "DELETE FROM inscripcion WHERE id_alumno = ? and id_materia = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idAlu);
            ps.setInt(2, idMat);
            int rs = ps.executeUpdate();
            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Inscripcion borrada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
    }

    public List<Inscripcion> obtenerInscripciones() {
        ArrayList<Inscripcion> inscripciones = new ArrayList();
        String sql = "SELECT * FROM inscripcion";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion ins = new Inscripcion();
                Alumno alu = ad.buscarAlumnoporid(rs.getInt("id_alumno"));
                Materia mat = md.buscarMateria(rs.getInt("id_materia"));
                ins.setIdInscripcion(rs.getInt("id_inscripcion"));
                ins.setAlumno(alu);
                ins.setMateria(mat);
                ins.setNota(rs.getDouble("nota"));
                inscripciones.add(ins);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlu) {
        ArrayList<Inscripcion> inscripciones = new ArrayList();
        String sql = "SELECT * FROM inscripcion WHERE id_alumno = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idAlu);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion ins = new Inscripcion();
                Alumno alu = ad.buscarAlumnoporid(rs.getInt("id_alumno"));
                Materia mat = md.buscarMateria(rs.getInt("id_materia"));
                ins.setIdInscripcion(rs.getInt("id_inscripcion"));
                ins.setAlumno(alu);
                ins.setMateria(mat);
                ins.setNota(rs.getDouble("nota"));
                inscripciones.add(ins);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return inscripciones;
    }

    public List<Materia> obtenerMateriasCursadas(int idAlu) {
        ArrayList<Materia> materias = new ArrayList();
        String sql = "SELECT inscripcion.id_materia, nombre, anio FROM inscripcion, materia "
                + " WHERE inscripcion.id_materia = materia.id_materia AND inscripcion.id_alumno = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idAlu);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia mat = new Materia();
                mat.setIdMateria(rs.getInt("id_materia"));
                mat.setNombre(rs.getString("nombre"));
                mat.setAnioMateria(rs.getInt("anio"));
                materias.add(mat);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return materias;
    }

    public List<Materia> obtenerMateriasNoCursadas(int idAlu) {
        ArrayList<Materia> materias = new ArrayList();
        String sql = "SELECT * FROM materia WHERE estado = 1 and id_materia not in"
                + "(SELECT id_materia FROM inscripcion WHERE id_alumno = ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idAlu);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia mat = new Materia();
                mat.setIdMateria(rs.getInt("id_materia"));
                mat.setNombre(rs.getString("nombre"));
                mat.setAnioMateria(rs.getInt("anio"));
                materias.add(mat);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return materias;
    }

    public List<Alumno> obtenerAlumnoPorMateria(int idMat) {
        ArrayList<Alumno> alumnos = new ArrayList();
        String sql = "SELECT a.id_alumno, dni, nombre, apellido, fechaNacimiento, estado FROM inscripcion i, alumno a "
                + "WHERE i.id_alumno = a.id_alumno AND id_materia = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idMat);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alu = new Alumno();
                alu.setIdAlumno(rs.getInt("id_alumno"));
                alu.setDni(rs.getInt("dni"));
                alu.setApellido(rs.getString("apellido"));
                alu.setNombre(rs.getString("nombre"));
                alu.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alu.setEstado(rs.getBoolean("estado"));
                alumnos.add(alu);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return alumnos;
    }
}
