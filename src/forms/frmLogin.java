/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import Constructores.Alumno;
import Constructores.Curso;
import Constructores.Grupo;
import Constructores.Nodo;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mensajeria.Chat;

/**
 *
 * @author anton
 */
public class frmLogin extends javax.swing.JFrame {
    // Lista de usuarios y contraseñas
    private List<Usuario> usuarios;
    
    public frmLogin() {
        initComponents();
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("admin", "admin123"));
        usuarios.add(new Usuario("user", "user123"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        btnCrearcuenta = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel10.setText("¿Has olvidado la contraseña?");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 160, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 80, 87));
        jLabel9.setText("Contraseña");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 130, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Header.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 110));

        txtContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContraKeyReleased(evt);
            }
        });
        jPanel2.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 340, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 80, 87));
        jLabel7.setText("Usuario");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 70, 40));

        btnCrearcuenta.setBackground(new java.awt.Color(34, 47, 80));
        btnCrearcuenta.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        btnCrearcuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearcuenta.setText("Registrarse");
        btnCrearcuenta.setBorder(null);
        btnCrearcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearcuentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnCrearcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 340, 40));

        btnIniciarSesion.setBackground(new java.awt.Color(227, 5, 22));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 340, 40));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 340, 40));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 450, 330));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AZUL2_1.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AZUL1_1.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CESAR_1.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rojo1_1.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(73, 80, 87));
        jLabel8.setText("© 2024 Creado y diseñado por Vallejianos.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1290, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addGap(50, 50, 50)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(120, 120, 120)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLabel4))
                        .addComponent(jLabel1))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(185, 185, 185)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(364, 364, 364)
                            .addComponent(jLabel1)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        
//        frmRecuperarContra f = new frmRecuperarContra();
//        f.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void txtContraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
        }
    }//GEN-LAST:event_txtContraKeyReleased

    private void btnCrearcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearcuentaActionPerformed
//        frmRegistrarse f = new frmRegistrarse();
//        f.setVisible(true);
    }//GEN-LAST:event_btnCrearcuentaActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String usuario = txtUsuario.getText();
        String contra = new String(txtContra.getPassword());

        boolean isAuthenticated = false;
        
        for (Usuario u : usuarios) {
            if (u.getNombre().equals(usuario) && u.getContrasena().equals(contra)) {
                isAuthenticated = true;
                break;
            }
        }

        if (isAuthenticated) {
            JOptionPane.showMessageDialog(this, "Usuario correcto");
            inicializar_todo();
            
            this.dispose(); // Close the current login form
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }
    
    private void inicializar_todo(){
        // Crear una instancia de Chat
        Chat chat = new Chat();

        // Crear alumnos
        Alumno alumno1 = new Alumno("Juan", "Primero");
        Alumno alumno2 = new Alumno("Ana", "Primero");
        Alumno alumno3 = new Alumno("Luis", "Segundo");
        Alumno alumno4 = new Alumno("Maria", "Segundo");

        // Crear nodos para los alumnos
        Nodo<Alumno> nodoAlumno1 = new Nodo<>(alumno1);
        Nodo<Alumno> nodoAlumno2 = new Nodo<>(alumno2);
        Nodo<Alumno> nodoAlumno3 = new Nodo<>(alumno3);
        Nodo<Alumno> nodoAlumno4 = new Nodo<>(alumno4);

        // Crear una lista de nodos de Alumnos
        List<Nodo<Alumno>> listaNodosAlumnos = new ArrayList<>();
        listaNodosAlumnos.add(nodoAlumno1);
        listaNodosAlumnos.add(nodoAlumno2);
        listaNodosAlumnos.add(nodoAlumno3);
        listaNodosAlumnos.add(nodoAlumno4);

        // Crear grupos y agregar alumnos
        Grupo grupo1 = new Grupo("Grupo 1");
        grupo1.agregarAlumno(alumno1);
        grupo1.agregarAlumno(alumno2);

        Grupo grupo2 = new Grupo("Grupo 2");
        grupo2.agregarAlumno(alumno3);
        grupo2.agregarAlumno(alumno4);

        // Crear nodos para los grupos
        Nodo<Grupo> nodoGrupo1 = new Nodo<>(grupo1);
        Nodo<Grupo> nodoGrupo2 = new Nodo<>(grupo2);

        // Crear una lista de nodos de grupos
        List<Nodo<Grupo>> listaNodosGrupos = new ArrayList<>();
        listaNodosGrupos.add(nodoGrupo1);
        listaNodosGrupos.add(nodoGrupo2);

        // Crear cursos y agregar grupos
        Curso curso = new Curso("Matemática II", "Lunes");
        curso.agregarGrupo(grupo1);
        curso.agregarGrupo(grupo2);

        Curso curso2 = new Curso("Creatividad e Innovación", "Martes");
        curso2.agregarGrupo(grupo1);
        curso2.agregarGrupo(grupo2);

        Curso curso3 = new Curso("Electrónica y Circuitos Digitales", "Miércoles");
        curso3.agregarGrupo(grupo1);
        curso3.agregarGrupo(grupo2);

        Curso curso4 = new Curso("Empredimiento y Organización de Empresas", "Jueves");
        curso4.agregarGrupo(grupo1);
        curso4.agregarGrupo(grupo2);

        // Crear nodos para los cursos
        Nodo<Curso> nodoCurso = new Nodo<>(curso);
        Nodo<Curso> nodoCurso2 = new Nodo<>(curso2);
        Nodo<Curso> nodoCurso3 = new Nodo<>(curso3);
        Nodo<Curso> nodoCurso4 = new Nodo<>(curso4);

        // Crear una lista de nodos de cursos
        List<Nodo<Curso>> listaNodosCursos = new ArrayList<>();
        listaNodosCursos.add(nodoCurso);
        listaNodosCursos.add(nodoCurso2);
        listaNodosCursos.add(nodoCurso3);
        listaNodosCursos.add(nodoCurso4);
//
//        // Mostrar la información almacenada en los nodos
//        for (Grupo grupo : nodoCurso.getData().getGrupos()) {
//            System.out.println("Grupo: " + grupo.getNombre());
//            for (Alumno alumno : grupo.getIntegrantes()) {
//                System.out.println("  Alumno: " + alumno.getNombre() + ", Ciclo: " + alumno.getCiclo());
//            }
//        }

        frmCursos formularioCursos = new frmCursos(chat);
        formularioCursos.setListaNodosCursos(listaNodosCursos);
        formularioCursos.setListaNodosAlumnos(listaNodosAlumnos);
        formularioCursos.setVisible(true);
    }
    
    // Clase interna para representar un usuario
    private class Usuario {
        private String nombre;
        private String contrasena;

        public Usuario(String nombre, String contrasena) {
            this.nombre = nombre;
            this.contrasena = contrasena;
        }

        public String getNombre() {
            return nombre;
        }

        public String getContrasena() {
            return contrasena;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearcuenta;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
