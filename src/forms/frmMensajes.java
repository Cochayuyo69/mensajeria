/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import Constructores.Alumno;
import Constructores.Curso;
import Constructores.Grupo;
import Constructores.Nodo;
import java.util.List;
import mensajeria.Chat;

/**
 *
 * @author anton
 */
public class frmMensajes extends javax.swing.JFrame implements Chat.ChatListener{
    private List<Nodo<Curso>> listaNodosCursos;
    private List<Nodo<Alumno>> listaNodosAlumnos;
    private String grupo;
    private Chat chat;
    
    public frmMensajes(Chat chat) {
        initComponents();
        this.chat = chat;
        this.chat.agregarListener(this);
        actualizarMensajes();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaMensajes = new javax.swing.JTextArea();
        jtxtMensaje = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Chat del Usuario");

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        lblTitulo.setText("Chat");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 390, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ucvxs.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        txtaMensajes.setColumns(20);
        txtaMensajes.setRows(5);
        jScrollPane1.setViewportView(txtaMensajes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 370, 230));

        jtxtMensaje.setText("Escriba un nuevo mensaje....");
        jPanel1.add(jtxtMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 270, 30));

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        enviarMensaje(jtxtMensaje.getText());
    }//GEN-LAST:event_btnEnviarActionPerformed

    
    //Lista de Cursos
    public void setListaNodosCursos(List<Nodo<Curso>> listaNodosCursos) {
        this.listaNodosCursos = listaNodosCursos;
    }
    
    //Lista de Alumnos
    public void setListaNodosAlumnos(List<Nodo<Alumno>> listaNodosAlumnos) {
        this.listaNodosAlumnos = listaNodosAlumnos;
    }
    
    //Lista de Grupos
    public void setGrupo(String nombre) {
        grupo= nombre;
        lblTitulo.setText("Chat de " + grupo);
    }

    
    private void enviarMensaje(String mensaje) {
        String mensajeE = mensaje;
        if (!mensajeE.isEmpty()) {
            chat.enviarMensaje(grupo + ": " + mensajeE);
            actualizarMensajes();
            jtxtMensaje.setText(""); // Limpiar el campo de entrada
        }
    }

    private void actualizarMensajes() {
        txtaMensajes.setText(chat.obtenerMensajes());
    }

    @Override
    public void mensajeEnviado() {
        actualizarMensajes();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtxtMensaje;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtaMensajes;
    // End of variables declaration//GEN-END:variables
}
