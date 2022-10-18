/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author SENA
 */
public class JFLogin extends javax.swing.JFrame {

    /**
     * Creates new form JFLogin
     */
    public JFLogin() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contrase = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        Contra2 = new javax.swing.JPanel();
        TitleFormu = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        Contra = new javax.swing.JLabel();
        nombr = new javax.swing.JTextField();
        guar = new javax.swing.JButton();
        most = new javax.swing.JButton();
        Apelli = new javax.swing.JLabel();
        docu = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        nom2 = new javax.swing.JLabel();
        documen1 = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        apellido = new javax.swing.JTextField();
        Usuari = new javax.swing.JTextField();
        Iniciar = new javax.swing.JButton();
        Contra3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablainfo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N

        Contra2.setBackground(new java.awt.Color(153, 255, 255));

        TitleFormu.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        TitleFormu.setText("Formulario Login");

        Usuario.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        Usuario.setText("Usuario");

        Contra.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        Contra.setText("Contraseña");

        nombr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrActionPerformed(evt);
            }
        });

        guar.setBackground(new java.awt.Color(0, 204, 255));
        guar.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        guar.setText("Guardar");
        guar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guarActionPerformed(evt);
            }
        });

        most.setBackground(new java.awt.Color(0, 204, 255));
        most.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        most.setText("Mostrar");
        most.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostActionPerformed(evt);
            }
        });

        Apelli.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        Apelli.setText("Apellidos");

        docu.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        docu.setText("Documentos");

        buscar.setBackground(new java.awt.Color(0, 204, 255));
        buscar.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        buscar.setText("...");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        nom2.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        nom2.setText("Nombres");

        documen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documen1ActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(255, 51, 51));
        salir.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        Usuari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariActionPerformed(evt);
            }
        });

        Iniciar.setBackground(new java.awt.Color(0, 204, 255));
        Iniciar.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        Iniciar.setText("Iniciar");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });

        Tablainfo.setBackground(new java.awt.Color(204, 255, 255));
        Tablainfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Documento", "Nombres", "Apellidos", "Usuario", "Contraseñas"
            }
        ));
        jScrollPane1.setViewportView(Tablainfo);

        javax.swing.GroupLayout Contra2Layout = new javax.swing.GroupLayout(Contra2);
        Contra2.setLayout(Contra2Layout);
        Contra2Layout.setHorizontalGroup(
            Contra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Contra2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(Contra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Apelli, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Contra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Usuario)
                        .addComponent(Contra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(docu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nom2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(114, 114, 114)
                .addGroup(Contra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Contra3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Contra2Layout.createSequentialGroup()
                        .addGroup(Contra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(documen1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Contra2Layout.createSequentialGroup()
                                .addGroup(Contra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombr, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(apellido)
                                    .addComponent(Usuari))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscar)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(Contra2Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(Contra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Contra2Layout.createSequentialGroup()
                        .addComponent(guar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(most)
                        .addGap(218, 218, 218)
                        .addComponent(Iniciar)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Contra2Layout.createSequentialGroup()
                        .addComponent(TitleFormu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salir)
                        .addGap(15, 15, 15))))
        );
        Contra2Layout.setVerticalGroup(
            Contra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Contra2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(Contra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleFormu)
                    .addComponent(salir))
                .addGroup(Contra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Contra2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(Contra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(docu)
                            .addComponent(documen1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(Contra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Contra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nombr, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buscar))
                            .addComponent(nom2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(Contra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Apelli))
                        .addGap(29, 29, 29)
                        .addGroup(Contra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Usuari, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Usuario))
                        .addGap(38, 38, 38))
                    .addGroup(Contra2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(Contra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contra)
                    .addComponent(Contra3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(Contra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Iniciar)
                    .addComponent(most)
                    .addComponent(guar))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contra2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contra2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrActionPerformed

    private void guarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guarActionPerformed

    private void mostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void documen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documen1ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void UsuariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuariActionPerformed

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IniciarActionPerformed

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
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Apelli;
    public javax.swing.JLabel Contra;
    public javax.swing.JPanel Contra2;
    public javax.swing.JTextField Contra3;
    private javax.swing.JPasswordField Contrase;
    public javax.swing.JButton Iniciar;
    public javax.swing.JTable Tablainfo;
    public javax.swing.JLabel TitleFormu;
    public javax.swing.JTextField Usuari;
    public javax.swing.JLabel Usuario;
    public javax.swing.JTextField apellido;
    public javax.swing.JButton buscar;
    public javax.swing.JLabel docu;
    public javax.swing.JTextField documen1;
    public javax.swing.JButton guar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton most;
    public javax.swing.JLabel nom2;
    public javax.swing.JTextField nombr;
    public javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}