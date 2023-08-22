
package ventanasAlmacen;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;


public class RegCliente extends javax.swing.JFrame {

   
    DefaultTableModel model = new DefaultTableModel();
    private int banderaActualizar;

    public RegCliente() {
        initComponents();
        setTitle("Registrar nuevo cliente");
        setSize(1050, 720);
        setResizable(false);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/imagenes/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();

        jTable_Clientes = new JTable(model);
        jScrollPane1.setViewportView(jTable_Clientes);

        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Cedula");
        model.addColumn("Fecha Nac");
        model.addColumn("Nit");
        model.addColumn("Direccion");
        model.addColumn("telefono");
        model.addColumn("Email");
        
        
        jTable_Clientes.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int fila_point = jTable_Clientes.rowAtPoint(e.getPoint());
                int columna_point = 0;
                
                if(fila_point > -1){
                    
                    int selectedRow = jTable_Clientes.getSelectedRow();
                if (selectedRow != -1) {
                    for (int column = 0; column < jTable_Clientes.getColumnCount(); column++) {
                        Object value = jTable_Clientes.getValueAt(selectedRow, column);
                        System.out.println("Valor en fila " + selectedRow + ", columna " + column + ": " + value);
                        
                        if(column == 0){
                            txt_Nombre.setText((String) value);                            
                        }
                        if(column == 1){
                            txt_Apellido.setText((String) value);                            
                        }
                        
                        if(column == 2){
                            txt_Id.setText((String) value);                            
                        }
                        
                        if(column == 3){
                            txt_FechaNac.setText((String) value);                            
                        }
                        String seleccion = (String) cmb_tipoPersona.getSelectedItem();
                        if(column == 4 && seleccion == "Juridica"){
                            txt_Id.setText((String) value);                            
                        }
                        
                        if(column == 5){
                            txt_Direccion.setText((String) value);                            
                        }
                        
                        if(column == 6){
                            txt_Telefono.setText((String) value);                            
                        }
                        
                        if(column == 7 ){
                            txt_Email.setText((String) value);                            
                        }
                        
  
                    }
                }
                   
                    
                    
                            
                }
            }
                        
        });
        
        
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Logo_Negro.jpg"));
        return retValue;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_Apellido = new javax.swing.JLabel();
        jLabel_Id = new javax.swing.JLabel();
        jLabel_Direccion = new javax.swing.JLabel();
        jLabel_Telefono = new javax.swing.JLabel();
        jLabel_FechaNac = new javax.swing.JLabel();
        jLabel_TipoPersona = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        txt_Id = new javax.swing.JTextField();
        txt_Direccion = new javax.swing.JTextField();
        txt_Telefono = new javax.swing.JTextField();
        txt_FechaNac = new javax.swing.JTextField();
        txt_Email = new javax.swing.JTextField();
        jButton_Reg = new javax.swing.JButton();
        jButton_Actualizar = new javax.swing.JButton();
        jButton_Eliminar = new javax.swing.JButton();
        cmb_tipoPersona = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Clientes = new javax.swing.JTable();
        jLabel_Registrar = new javax.swing.JLabel();
        jLabel_Actualizar = new javax.swing.JLabel();
        jLabel_Actualizar1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton_Salir = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setText("Registro de clientes");
        getContentPane().add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        jLabel_Nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre.setText("Nombre:");
        getContentPane().add(jLabel_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel_Apellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Apellido.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Apellido.setText("Apellido:");
        getContentPane().add(jLabel_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel_Id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Id.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Id.setText("Cédula:");
        getContentPane().add(jLabel_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel_Direccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Direccion.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Direccion.setText("Direccion:");
        getContentPane().add(jLabel_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, -1));

        jLabel_Telefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Telefono.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Telefono.setText("Telefono:");
        getContentPane().add(jLabel_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, -1));

        jLabel_FechaNac.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_FechaNac.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FechaNac.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel_FechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, 20));

        jLabel_TipoPersona.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_TipoPersona.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TipoPersona.setText("Tipo de Persona:");
        getContentPane().add(jLabel_TipoPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel_Email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Email.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Email.setText("Email:");
        getContentPane().add(jLabel_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, -1, 20));

        txt_Nombre.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Nombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 320, -1));

        txt_Apellido.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_Apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Apellido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 320, -1));

        txt_Id.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_Id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Id.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 320, -1));

        txt_Direccion.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_Direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Direccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 310, -1));

        txt_Telefono.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_Telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Telefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 310, -1));

        txt_FechaNac.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_FechaNac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_FechaNac.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_FechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 310, -1));

        txt_Email.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Email.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 310, -1));

        jButton_Reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/adicionarCli.JPG"))); // NOI18N
        jButton_Reg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 90, 90, 80));

        jButton_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizarCli.jpg"))); // NOI18N
        jButton_Actualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 200, 90, 80));

        jButton_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminarCli.JPG"))); // NOI18N
        jButton_Eliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 310, 90, 80));

        cmb_tipoPersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Natural", "Juridica", " " }));
        cmb_tipoPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_tipoPersonaActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_tipoPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 320, -1));

        jTable_Clientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_Clientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 950, 180));

        jLabel_Registrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Registrar.setText("Registrar");
        getContentPane().add(jLabel_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 70, -1, -1));

        jLabel_Actualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Actualizar.setText("Actualizar");
        getContentPane().add(jLabel_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, -1, -1));

        jLabel_Actualizar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Actualizar1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Actualizar1.setText("Eliminar");
        getContentPane().add(jLabel_Actualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 290, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 950, 380));

        jButton_Salir.setText("Salir");
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 630, 90, 40));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegActionPerformed

        String seleccion = (String) cmb_tipoPersona.getSelectedItem();

        String nombre, apellido, cedula, fechaNac, nit, direccion, telefono, email;

        nombre = txt_Nombre.getText().trim();
        apellido = txt_Apellido.getText().trim();
        cedula = txt_Id.getText().trim();
        fechaNac = txt_FechaNac.getText().trim();
        nit = txt_Id.getText().trim();
        direccion = txt_Direccion.getText().trim();
        telefono = txt_Telefono.getText().trim();
        email = txt_Email.getText().trim();

        Object[] fila = new Object[8];

        if (seleccion == "Natural") {

            fila[0] = nombre;
            fila[1] = apellido;
            fila[2] = cedula;
            fila[3] = fechaNac;
            fila[4] = "N/A";
            fila[5] = direccion;
            fila[6] = telefono;
            fila[7] = email;

        } else {
            fila[0] = nombre;
            fila[1] = "N/A";
            fila[2] = "N/A";
            fila[3] = "N/A";
            fila[4] = nit;
            fila[5] = direccion;
            fila[6] = telefono;
            fila[7] = "N/A";

        }
        model.addRow(fila);
        
        
        
        Limpiar();
                
                


    }//GEN-LAST:event_jButton_RegActionPerformed

    private void cmb_tipoPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tipoPersonaActionPerformed
        // TODO add your handling code here:

        String seleccion = (String) cmb_tipoPersona.getSelectedItem();

        if (seleccion == "Juridica") {

            txt_FechaNac.setEnabled(false);
            txt_Apellido.setEnabled(false);
            txt_Email.setEnabled(false);
            
            

            txt_FechaNac.setText("");
            txt_Apellido.setText("");
            txt_Email.setText("");
            jLabel_Id.setText("Nit:");

        } else {
            txt_FechaNac.setEnabled(true);
            txt_Apellido.setEnabled(true);
            txt_Email.setEnabled(true);

            jLabel_Id.setText("Cedula:");
        }


    }//GEN-LAST:event_cmb_tipoPersonaActionPerformed

    private void txt_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IdActionPerformed

    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable_Clientes.getSelectedRow(); 
    if (selectedRow >= 0) {
        String seleccion = (String) cmb_tipoPersona.getSelectedItem();
        String nombre, apellido, cedula, fechaNac, nit, direccion, telefono, email;

        nombre = txt_Nombre.getText().trim();
        apellido = txt_Apellido.getText().trim();
        cedula = txt_Id.getText().trim();
        fechaNac = txt_FechaNac.getText().trim();
        nit = txt_Id.getText().trim(); 
        direccion = txt_Direccion.getText().trim();
        telefono = txt_Telefono.getText().trim();
        email = txt_Email.getText().trim();

        // Actualizar los datos en la fila seleccionada
        model.setValueAt(nombre, selectedRow, 0);
        model.setValueAt(apellido, selectedRow, 1);
        model.setValueAt(cedula, selectedRow, 2);
        model.setValueAt(fechaNac, selectedRow, 3);
        model.setValueAt(nit, selectedRow, 4);
        model.setValueAt(direccion, selectedRow, 5);
        model.setValueAt(telefono, selectedRow, 6);
        model.setValueAt(email, selectedRow, 7);
    }
        
        Limpiar();
    }//GEN-LAST:event_jButton_ActualizarActionPerformed

    private void jButton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable_Clientes.getSelectedRow(); // Supongamos que jTable es el nombre de tu tabla
    if (selectedRow >= 0) {
        model.removeRow(selectedRow);
        
    }
    Limpiar();
    }//GEN-LAST:event_jButton_EliminarActionPerformed

    private void txt_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ApellidoActionPerformed

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_jButton_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(RegCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_tipoPersona;
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JButton jButton_Reg;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel jLabel_Actualizar;
    private javax.swing.JLabel jLabel_Actualizar1;
    private javax.swing.JLabel jLabel_Apellido;
    private javax.swing.JLabel jLabel_Direccion;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_FechaNac;
    private javax.swing.JLabel jLabel_Id;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Registrar;
    private javax.swing.JLabel jLabel_Telefono;
    private javax.swing.JLabel jLabel_TipoPersona;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Clientes;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Direccion;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_FechaNac;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Telefono;
    // End of variables declaration//GEN-END:variables

public void Limpiar(){
    
    txt_Nombre.setText("");
    txt_Apellido.setText("");
    txt_FechaNac.setText("");
    txt_Id.setText("");
    txt_Direccion.setText("");
    txt_Email.setText("");
    txt_Telefono.setText("");
    
    
}


}
