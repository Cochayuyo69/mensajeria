/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import Constructores.Alumno;
import Constructores.Curso;
import Constructores.Docente;
import Constructores.Grupo;
import Constructores.ListaUsuarios;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mensajeria.Chat;

/**
 *
 * @author anton
 */
public class frmPrincipal extends javax.swing.JFrame {
    private List<Alumno> listaAlumnos;
    private List<Docente> listaDocentes;
    private List<Curso> listaCursos;
    private List<Grupo> listaGrupos;
    private ListaUsuarios listaUsuarios;
    private String nombreUsuario;
    private Chat chat;
    private Map<String, Chat> chatsPorGrupo = new HashMap<>();
    
    public frmPrincipal(List<Alumno> listaAlumnos, List<Docente> listaDocentes, 
                   List<Curso> listaCursos, List<Grupo> listaGrupos, 
                   ListaUsuarios listaUsuarios, String nombreUsuario,Chat chat) {
        initComponents();
        this.listaAlumnos = listaAlumnos;
        this.listaDocentes = listaDocentes;
        this.listaCursos = listaCursos;
        this.listaGrupos = listaGrupos;
        this.listaUsuarios = listaUsuarios;
        this.nombreUsuario = nombreUsuario;
        this.chat = chat;
        
         
        cargarCursos();
        
        alumnoOdocente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        tabbedPaneCustom2 = new raven.tabbed.TabbedPaneCustom();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSaludo = new javax.swing.JLabel();
        cbxCursos = new javax.swing.JComboBox<>();
        btnGeneral = new javax.swing.JToggleButton();
        btnGrupal = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        btnMostrarAlumnos = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnMostrarDocentes = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        btnMostrarCursos = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        btnMostrarUsuarios = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        cbxCursoHistorial = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tabbedPaneCustom2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel1.setText("seleccione el curso:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 460, -1));

        lblSaludo.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        lblSaludo.setText("Bienvenido Luis");
        jPanel1.add(lblSaludo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 430, -1));

        cbxCursos.setFont(new java.awt.Font("Vensim Sans Mono", 0, 24)); // NOI18N
        cbxCursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbxCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 440, 60));

        btnGeneral.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btnGeneral.setText("Chat General");
        btnGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneralActionPerformed(evt);
            }
        });
        jPanel1.add(btnGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 180, 60));

        btnGrupal.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btnGrupal.setText("Chat de Grupo");
        btnGrupal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrupalActionPerformed(evt);
            }
        });
        jPanel1.add(btnGrupal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 200, 60));

        tabbedPaneCustom2.addTab("Cursos", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMostrarAlumnos.setBackground(new java.awt.Color(51, 153, 255));
        btnMostrarAlumnos.setText("Mostrar");
        jPanel2.add(btnMostrarAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 130, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Reporte de alumnos:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 230, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Reporte de docentes:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 230, -1));

        btnMostrarDocentes.setBackground(new java.awt.Color(51, 153, 255));
        btnMostrarDocentes.setText("Mostrar");
        jPanel2.add(btnMostrarDocentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 130, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Reporte de cursos:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 230, -1));

        btnMostrarCursos.setBackground(new java.awt.Color(51, 153, 255));
        btnMostrarCursos.setText("Mostrar");
        jPanel2.add(btnMostrarCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 130, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Reporte de usuarios:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 230, -1));

        btnMostrarUsuarios.setBackground(new java.awt.Color(51, 153, 255));
        btnMostrarUsuarios.setText("Mostrar");
        jPanel2.add(btnMostrarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 130, 50));

        tabbedPaneCustom2.addTab("Reportes", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setDoubleBuffered(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbxCursoHistorial.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbxCursoHistorial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(cbxCursoHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 260, 50));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel3.setText("SELECCIONE EL CURSO:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel4.setText("Historial");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 100, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ucvxs.png"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        btnMostrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel4.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 130, 50));

        tabbedPaneCustom2.addTab("Historial", jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneCustom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneCustom2, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneralActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new frmMensajes(chat, nombreUsuario, true).setVisible(true);
        });
    }//GEN-LAST:event_btnGeneralActionPerformed

    private void btnGrupalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrupalActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new frmMensajes(chat, nombreUsuario, false).setVisible(true);
        });
    }//GEN-LAST:event_btnGrupalActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        String nombreCurso = cbxCursoHistorial.getSelectedItem().toString();
        java.awt.EventQueue.invokeLater(() -> {
            new frmHistorial(chat, nombreCurso).setVisible(true);
        });
    }//GEN-LAST:event_btnMostrarActionPerformed
    
    private void cargarCursos() {
        // Limpiamos el combobox antes de cargar los cursos
        cbxCursos.removeAllItems();
        cbxCursoHistorial.removeAllItems();
        
        // Obtenemos el objeto Alumno del usuario actual
        Alumno alumnoActual = listaUsuarios.obtenerAlumno(nombreUsuario);
        if (alumnoActual != null) {
            // El usuario actual es un alumno, cargamos los cursos matriculados
            List<Curso> cursosMatriculados = alumnoActual.getCursosMatriculados();
            for (Curso curso : cursosMatriculados) {
                cbxCursos.addItem(curso.getNombre());
                cbxCursoHistorial.addItem(curso.getNombre());
            }
        } else {
            // El usuario actual no es un alumno, verificamos si es un docente
            Docente docenteActual = listaUsuarios.obtenerDocente(nombreUsuario);
            if (docenteActual != null) {
                // El usuario actual es un docente, cargamos los cursos que dicta
                List<Curso> cursosDictados = docenteActual.getCursosAsignados();
                for (Curso curso : cursosDictados) {
                    cbxCursos.addItem(curso.getNombre());
                    cbxCursoHistorial.addItem(curso.getNombre());
                }
            } else {
                // Manejo de caso inesperado (debería ser manejado según el diseño de la aplicación)
                System.out.println("El usuario no es ni alumno ni docente.");
            }
        }
    }
    
    public void alumnoOdocente(){
        cbxCursoHistorial.setEnabled(false);
        btnMostrar.setEnabled(false);
        Alumno alumnoActual = listaUsuarios.obtenerAlumno(nombreUsuario);
        if (alumnoActual != null) {
            // Configurar mensaje de bienvenida
            lblSaludo.setText("Bienvenido " + listaUsuarios.obtenerNombreAlumno(nombreUsuario));
        } else {
            // El usuario actual no es un alumno, verificamos si es un docente
            Docente docenteActual = listaUsuarios.obtenerDocente(nombreUsuario);
            if (docenteActual != null) {
                cbxCursoHistorial.setEnabled(true);
                btnMostrar.setEnabled(true);
                // Configurar mensaje de bienvenida
                lblSaludo.setText("Bienvenido " + listaUsuarios.obtenerDocente(nombreUsuario).getNombre());
            } else {
                // Manejo de caso inesperado (debería ser manejado según el diseño de la aplicación)
                System.out.println("El usuario no es ni alumno ni docente.");
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnGeneral;
    private javax.swing.JToggleButton btnGrupal;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JToggleButton btnMostrarAlumnos;
    private javax.swing.JToggleButton btnMostrarCursos;
    private javax.swing.JToggleButton btnMostrarDocentes;
    private javax.swing.JToggleButton btnMostrarUsuarios;
    private javax.swing.JComboBox<String> cbxCursoHistorial;
    private javax.swing.JComboBox<String> cbxCursos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblSaludo;
    private raven.tabbed.TabbedPaneCustom tabbedPaneCustom2;
    // End of variables declaration//GEN-END:variables
}
