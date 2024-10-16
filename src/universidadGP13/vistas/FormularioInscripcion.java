/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidadGP13.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadGP13.accesoAdatos.AlumnoData;
import universidadGP13.accesoAdatos.InscripcionData;
import universidadGP13.accesoAdatos.MateriaData;
import universidadGP13.entidades.Alumno;
import universidadGP13.entidades.Inscripcion;
import universidadGP13.entidades.Materia;

/**
 *
 * @author Hernan
 */
public class FormularioInscripcion extends javax.swing.JInternalFrame {
    private List <Alumno> listadeAlumnos;
    private List <Materia> listadeMaterias;
    private InscripcionData insData;
    private AlumnoData aluData;
    private DefaultTableModel modelo;
    
    /**
     * Creates new form FormularioInscripcion
     */
    public FormularioInscripcion() {
        initComponents();
        modelo = new DefaultTableModel();
        aluData = new AlumnoData();
        listadeAlumnos = aluData.listarAlumnos();
        insData = new InscripcionData();
        cargarAlumnos();
        cabeceradeTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        rbInscriptas = new javax.swing.JRadioButton();
        rbNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jbInscribir = new javax.swing.JButton();
        jbAInscripcion = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de inscripción");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Seleccione un alumno:");

        cbAlumnos.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        cbAlumnos.setMaximumRowCount(7);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Listado de materias");

        rbInscriptas.setText("Materias inscriptas");
        rbInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbInscriptasActionPerformed(evt);
            }
        });

        rbNoInscriptas.setText("Materias no inscriptas");
        rbNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoInscriptasActionPerformed(evt);
            }
        });

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtMaterias);

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbInscribir.setText("Inscribir");
        jbInscribir.setEnabled(false);
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAInscripcion.setText("Anular inscripción");
        jbAInscripcion.setEnabled(false);
        jbAInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAInscripcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jbAInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(rbInscriptas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbNoInscriptas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbAlumnos))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbInscriptas)
                    .addComponent(rbNoInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbInscribir)
                    .addComponent(jbAInscripcion))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbInscriptasActionPerformed
        limpiarTabla();
        rbNoInscriptas.setSelected(false);
        alumnoInscripto();
        jbAInscripcion.setEnabled(true);
        jbInscribir.setEnabled(false);
    }//GEN-LAST:event_rbInscriptasActionPerformed

    private void rbNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoInscriptasActionPerformed
        limpiarTabla();
        rbInscriptas.setSelected(false);
        alumnoNoInscripto();
        jbAInscripcion.setEnabled(false);
        jbInscribir.setEnabled(true);
    }//GEN-LAST:event_rbNoInscriptasActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        int filaElegida = jtMaterias.getSelectedRow();
        if(filaElegida != -1){
            Alumno alu = (Alumno) cbAlumnos.getSelectedItem();
            int idMat = (Integer) modelo.getValueAt(filaElegida, 0);
            String nomMat = (String) modelo.getValueAt(filaElegida, 1);
            int anioMat = (Integer) modelo.getValueAt(filaElegida, 2);
            Materia mat = new Materia (idMat,nomMat,anioMat,true);
            Inscripcion ins = new Inscripcion(alu,mat,0);
            insData.guardarInscripcion(ins);
            limpiarTabla();
            rbInscriptas.setSelected(false);
            rbNoInscriptas.setSelected(false);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una materia para inscribir al alumno");
        }
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbAInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAInscripcionActionPerformed
        int filaElegida = jtMaterias.getSelectedRow();
        if(filaElegida != -1){
            Alumno alu = (Alumno) cbAlumnos.getSelectedItem();
            int idMat = (Integer) modelo.getValueAt(filaElegida, 0);
            insData.borrarInscripcionMateriaAlumno(alu.getIdAlumno(), idMat);
            limpiarTabla();
            rbInscriptas.setSelected(false);
            rbNoInscriptas.setSelected(false);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una materia para anular la inscripción del alumno");
        }
    }//GEN-LAST:event_jbAInscripcionActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void cargarAlumnos(){
        for(Alumno alumno:listadeAlumnos){
            cbAlumnos.addItem(alumno);
        }
    }
    
    private void cabeceradeTabla(){
        ArrayList <Object> cabecera = new ArrayList <>();
        cabecera.add("ID");
        cabecera.add("Nombre");
        cabecera.add("Año");
        for (Object it:cabecera){
            modelo.addColumn(it);
        }
        jtMaterias.setModel(modelo);
    }
    
    private void limpiarTabla(){
        int indice = modelo.getRowCount()-1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    private void alumnoNoInscripto(){
        Alumno selecionado = (Alumno)cbAlumnos.getSelectedItem();
        listadeMaterias = insData.obtenerMateriasNoCursadas(selecionado.getIdAlumno());
        for (Materia m: listadeMaterias) {
            modelo.addRow(new Object[] {m.getIdMateria(),m.getNombre(),m.getAnioMateria()});
        }
    }
    
    private void alumnoInscripto(){
        Alumno selecionado = (Alumno)cbAlumnos.getSelectedItem();
        listadeMaterias = insData.obtenerMateriasCursadas(selecionado.getIdAlumno());
        for (Materia m: listadeMaterias) {
            modelo.addRow(new Object[] {m.getIdMateria(),m.getNombre(),m.getAnioMateria()});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAInscripcion;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable jtMaterias;
    private javax.swing.JRadioButton rbInscriptas;
    private javax.swing.JRadioButton rbNoInscriptas;
    // End of variables declaration//GEN-END:variables
}
