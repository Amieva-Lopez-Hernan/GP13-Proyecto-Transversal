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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadGP13.entidades.Materia;

/**
 *
 * @author gouff
 */
public class MateriaData {
    
    private Connection conn=null;
    
    public MateriaData(){
        conn=Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
        String sql = "INSERT INTO materia (nombre,anio,estado)"
                + "VALUES(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia guardada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }
    
    public Materia buscarMateria(int idMateria){
        Materia materia = null;
        String sql = "SELECT nombre , anio, estado FROM materia WHERE id_materia = ? AND estado = 1";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,idMateria);
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(idMateria);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materia.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "La materia que busca no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        return materia;
    }

    public void modificarMateria(Materia materia){
        String sql = "UPDATE materia SET nombre=?, anio=?, estado=? "
                + "WHERE id_materia=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2,materia.getAnioMateria());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());
            int update = ps.executeUpdate();
            if(update==1){
                JOptionPane.showMessageDialog(null, "Materia modificada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }

    public void eliminarMateria(int idMateria){
        String sql = "UPDATE materia SET estado = 0 WHERE id_materia=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idMateria);
            int eliminado = ps.executeUpdate();
            if (eliminado == 1){
                JOptionPane.showMessageDialog(null, "Materia eliminada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }

    public List<Materia> listarMaterias (){
        ArrayList<Materia> materias=new ArrayList();
        String sql = "SELECT id_materia,nombre, anio , estado FROM materia WHERE estado=1";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("id_materia"));
                materia.setEstado(rs.getBoolean("estado"));
                materia.setAnioMateria(rs.getInt("anio"));
                materia.setNombre(rs.getString("nombre"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        return materias;
    }
}
