/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
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

/**
 *
 * @author pablo.castaño
 */
public class RegProducto_1 extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    public RegProducto_1() {
        initComponents();
        setTitle("Registrar nuevo producto");
        setSize(1050, 720);
        setResizable(false);
        setLocationRelativeTo(null);


        ImageIcon wallpaper = new ImageIcon("src/imagenes/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
        jTable_Productos = new JTable(model);
        jScrollPane1.setViewportView(jTable_Productos);

        model.addColumn("Tipo de producto");
        model.addColumn("Nombre");
        model.addColumn("Codigo");
        model.addColumn("Valor unitario");
        model.addColumn("Cantidad");
        model.addColumn("Fecha de vencimiento");
        model.addColumn("Codigo de aprobacion");
        model.addColumn("Temperatura de refrigeracion");
        model.addColumn("Peso de envase");
        model.addColumn("Fecha de envasado");
        model.addColumn("Pais de origen");
        model.addColumn("Descripcion");
        
        
        jTable_Productos.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                
                int fila_point = jTable_Productos.rowAtPoint(e.getPoint());
                int columna_point = 0;
                
                if(fila_point > -1){
                    
                    int selectedRow = jTable_Productos.getSelectedRow();
                if (selectedRow != -1) {
                    for (int column = 0; column < jTable_Productos.getColumnCount(); column++) {
                        Object value = jTable_Productos.getValueAt(selectedRow, column);
                        System.out.println("Valor en fila " + selectedRow + ", columna " + column + ": " + value);
                        
                        if(column == 0){
                            jComboBoxTipoProducto.getSelectedItem();                           
                        }
                        if(column == 1){
                            jTextField_Nombre.setText((String) value);                            
                        }
                        
                        if(column == 2){
                            jTextField_Codigo.setText((String) value);                            
                        }
                        
                        if(column == 3){
                            jTextField_ValorUnitario.setText((String) value);                            
                        }
                        
                        if(column == 4){
                            jTextField_CantidadExistente.setText((String) value);                            
                        }
                        
                        if(column == 5){
                            jTextField_FechaVencimiento.setText((String) value);                            
                        }
                        
                        if(column == 6){
                            jTextField_CodigoAprobacion.setText((String) value);                            
                        }
                        
                        if(column == 7 ){
                            jTextField_TemperaturaRefrigeracion.setText((String) value);                            
                        }
                        
                        if (column == 8){
                            jTextField_PesoEnvase.setText((String) value);
                        }
                        
                        if (column == 9){
                            jTextField_FechaEnvasado.setText ((String) value);
                        }
                        
                        if (column == 10){
                            jComboBox_Pais.getSelectedItem();
                        }
                        
                        if (column == 11){
                            
                            jTextPane_Descripcion.setText( (String) value);
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Productos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jComboBox_Pais = new javax.swing.JComboBox<>();
        jComboBoxTipoProducto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Nombre = new javax.swing.JTextField();
        jTextField_Codigo = new javax.swing.JTextField();
        jTextField_ValorUnitario = new javax.swing.JTextField();
        jTextField_CantidadExistente = new javax.swing.JTextField();
        jTextField_FechaVencimiento = new javax.swing.JTextField();
        jTextField_PesoEnvase = new javax.swing.JTextField();
        jTextField_FechaEnvasado = new javax.swing.JTextField();
        jTextField_TemperaturaRefrigeracion = new javax.swing.JTextField();
        jTextField_CodigoAprobacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton_Registrar = new javax.swing.JButton();
        jButton_Actualizar = new javax.swing.JButton();
        jButton_Eliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane_Descripcion = new javax.swing.JTextPane();
        jButton_Salir = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de productos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, 30));

        jTable_Productos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_Productos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 990, 180));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox_Pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Colombia", "Argentina", "Chile", "Ecuador", "Perú" }));
        jComboBox_Pais.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox_Pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_PaisActionPerformed(evt);
            }
        });

        jComboBoxTipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Perecedero", "Refrigerado", "Envasado" }));
        jComboBoxTipoProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBoxTipoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoProductoActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo de producto:");

        jTextField_Nombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NombreActionPerformed(evt);
            }
        });

        jTextField_Codigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField_ValorUnitario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_ValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ValorUnitarioActionPerformed(evt);
            }
        });

        jTextField_CantidadExistente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField_FechaVencimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField_PesoEnvase.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_PesoEnvase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PesoEnvaseActionPerformed(evt);
            }
        });

        jTextField_FechaEnvasado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField_TemperaturaRefrigeracion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_TemperaturaRefrigeracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TemperaturaRefrigeracionActionPerformed(evt);
            }
        });

        jTextField_CodigoAprobacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_CodigoAprobacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CodigoAprobacionActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jLabel4.setText("Código:");

        jLabel5.setText("Valor unitario:");

        jLabel6.setText("Cantidad existente:");

        jLabel7.setText("Fecha de vencimiento:");

        jLabel8.setText("Pais de origen:");

        jLabel9.setText("Peso del envase:");

        jLabel10.setText("Fecha de envasado:");

        jLabel11.setText("Código de aprobación:");

        jLabel12.setText("Temperatura de refrigeración:");

        jLabel13.setText("Descripción del producto:");

        jButton_Registrar.setText("Registrar");
        jButton_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarActionPerformed(evt);
            }
        });

        jButton_Actualizar.setText("Actualizar");
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });

        jButton_Eliminar.setText("Eliminar");
        jButton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jTextPane_Descripcion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(210, 210, 210))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Codigo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_ValorUnitario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_CantidadExistente))
                                .addGap(158, 158, 158)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel12)
                                .addComponent(jLabel8)
                                .addComponent(jTextField_TemperaturaRefrigeracion)
                                .addComponent(jLabel10)
                                .addComponent(jTextField_CodigoAprobacion, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addComponent(jTextField_FechaEnvasado)
                                .addComponent(jTextField_PesoEnvase))
                            .addComponent(jLabel11)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBoxTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240)
                        .addComponent(jComboBox_Pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jTextField_FechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_Pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_PesoEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_FechaEnvasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_ValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_TemperaturaRefrigeracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_CodigoAprobacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_CantidadExistente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_FechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 990, 400));

        jButton_Salir.setText("Salir");
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 630, 90, 50));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_PaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_PaisActionPerformed
        
    }//GEN-LAST:event_jComboBox_PaisActionPerformed

    private void jTextField_TemperaturaRefrigeracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TemperaturaRefrigeracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TemperaturaRefrigeracionActionPerformed

    private void jTextField_CodigoAprobacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CodigoAprobacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CodigoAprobacionActionPerformed

    private void jTextField_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NombreActionPerformed

    private void jTextField_ValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ValorUnitarioActionPerformed

    private void jTextField_PesoEnvaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PesoEnvaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PesoEnvaseActionPerformed

    private void jComboBoxTipoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoProductoActionPerformed
        String seleccion = (String) jComboBoxTipoProducto.getSelectedItem();

        if (seleccion == "Perecedero") {

            jTextField_CodigoAprobacion.setEnabled(false);
            jTextField_TemperaturaRefrigeracion.setEnabled(false);
            jTextField_FechaEnvasado.setEnabled(false);
            jTextField_PesoEnvase.setEnabled(false);
            jComboBox_Pais.setEnabled(false);
            jTextField_FechaVencimiento.setEnabled(true);
            jTextField_Nombre.setEnabled(true);
            jTextField_Codigo.setEnabled(true);
            jTextPane_Descripcion.setEnabled(true);
            jTextField_ValorUnitario.setEnabled(true);
            jTextField_CantidadExistente.setEnabled(true);

        } 
        else if (seleccion == "Refrigerado") {

            jTextField_CodigoAprobacion.setEnabled(true);
            jTextField_TemperaturaRefrigeracion.setEnabled(true);
            jTextField_FechaEnvasado.setEnabled(false);
            jTextField_PesoEnvase.setEnabled(false);
            jComboBox_Pais.setEnabled(false);
            jTextField_FechaVencimiento.setEnabled(false);
            jTextField_Nombre.setEnabled(true);
            jTextField_Codigo.setEnabled(true);
            jTextPane_Descripcion.setEnabled(true);
            jTextField_ValorUnitario.setEnabled(true);
            jTextField_CantidadExistente.setEnabled(true);

        }
        else if (seleccion == "Envasado") {

            jTextField_CodigoAprobacion.setEnabled(false);
            jTextField_TemperaturaRefrigeracion.setEnabled(false);
            jTextField_FechaEnvasado.setEnabled(true);
            jTextField_PesoEnvase.setEnabled(true);
            jComboBox_Pais.setEnabled(true);
            jTextField_FechaVencimiento.setEnabled(false);
            jTextField_Nombre.setEnabled(true);
            jTextField_Codigo.setEnabled(true);
            jTextPane_Descripcion.setEnabled(true);
            jTextField_ValorUnitario.setEnabled(true);
            jTextField_CantidadExistente.setEnabled(true);

         
            
        } else if (seleccion == "Seleccionar") {
            
            jTextField_CodigoAprobacion.setEnabled(false);
            jTextField_TemperaturaRefrigeracion.setEnabled(false);
            jTextField_FechaEnvasado.setEnabled(false);
            jTextField_PesoEnvase.setEnabled(false);
            jComboBox_Pais.setEnabled(false);
            jTextField_FechaVencimiento.setEnabled(false);
            jTextField_Nombre.setEnabled(false);
            jTextField_Codigo.setEnabled(false);
            jTextPane_Descripcion.setEnabled(false);
            jTextField_ValorUnitario.setEnabled(false);
            jTextField_CantidadExistente.setEnabled(false);
            
            
        }
    }//GEN-LAST:event_jComboBoxTipoProductoActionPerformed

    private void jButton_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarActionPerformed
        String seleccion = (String) jComboBoxTipoProducto.getSelectedItem();
        String seleccion2 = (String) jComboBox_Pais.getSelectedItem ();

        String nombre, codigo, descripcion, fechaVencimiento, codigoAprobacion, fechaEnvasado, valorUnitario, cantidadExistente, temperaturaRefrigeracion, pesoEnvase;

        nombre = jTextField_Nombre.getText().trim();
        codigo = jTextField_Codigo.getText().trim();
        fechaVencimiento = jTextField_FechaVencimiento.getText().trim();
        codigoAprobacion = jTextField_CodigoAprobacion.getText().trim();
        fechaEnvasado = jTextField_FechaEnvasado.getText().trim();
        valorUnitario = jTextField_ValorUnitario.getText().trim();
        cantidadExistente = jTextField_CantidadExistente.getText().trim();
        temperaturaRefrigeracion = jTextField_TemperaturaRefrigeracion.getText().trim();
        pesoEnvase = jTextField_PesoEnvase.getText().trim();
        descripcion = jTextPane_Descripcion.getText().trim();
        
        String obtener = descripcion;
        

        Object[] fila = new Object[12];

        if (seleccion == "Perecedero") {

            fila[0] = seleccion;
            fila[1] = nombre;
            fila[2] = codigo;
            fila[3] = valorUnitario;
            fila[4] = cantidadExistente;
            fila[5] = fechaVencimiento;
            fila[6] = "";
            fila[7] = "";
            fila[8] = "";
            fila[9] = "";
            fila[10] = "";
            fila [11] = descripcion;
            
            

        } else if (seleccion == "Envasado") {
            
            fila[0] = seleccion;
            fila[1] = nombre;
            fila[2] = codigo;
            fila[3] = valorUnitario;
            fila[4] = cantidadExistente;
            fila[5] = "";
            fila[6] = "";
            fila[7] = "";
            fila[8] = pesoEnvase;
            fila[9] = fechaEnvasado;
            fila[10] = seleccion2;
            fila [11] = descripcion;
            

        } else if (seleccion == "Refrigerado"){
            
            fila[0] = seleccion;
            fila[1] = nombre;
            fila[2] = codigo;
            fila[3] = valorUnitario;
            fila[4] = cantidadExistente;
            fila[5] = "";
            fila[6] = codigoAprobacion;
            fila[7] = temperaturaRefrigeracion;
            fila[8] = "";
            fila[9] = "";
            fila[10] = "";
            fila [11] = descripcion;
            
        }
        model.addRow(fila);
       
        Limpiar();
    }//GEN-LAST:event_jButton_RegistrarActionPerformed

    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable_Productos.getSelectedRow(); 
    if (selectedRow >= 0) {
        String seleccion = (String) jComboBoxTipoProducto.getSelectedItem();
        String seleccion2 = (String) jComboBox_Pais.getSelectedItem();
        String nombre, codigo, descripcion, fechaVencimiento, codigoAprobacion, fechaEnvasado, valorUnitario, cantidadExistente, temperaturaRefrigeracion, pesoEnvase;

        nombre = jTextField_Nombre.getText().trim();
        codigo = jTextField_Codigo.getText().trim();
        descripcion = jTextPane_Descripcion.getText().trim();
        fechaVencimiento = jTextField_FechaVencimiento.getText().trim();
        codigoAprobacion = jTextField_CodigoAprobacion.getText().trim();
        fechaEnvasado = jTextField_FechaEnvasado.getText().trim();
        valorUnitario = jTextField_ValorUnitario.getText().trim();
        cantidadExistente = jTextField_CantidadExistente.getText().trim();
        temperaturaRefrigeracion = jTextField_TemperaturaRefrigeracion.getText().trim();
        pesoEnvase = jTextField_PesoEnvase.getText().trim();
        

        // Actualizar los datos en la fila seleccionada
        model.setValueAt(seleccion, selectedRow, 0);
        model.setValueAt(nombre, selectedRow, 1);
        model.setValueAt(codigo, selectedRow, 2);
        model.setValueAt(valorUnitario, selectedRow, 3);
        model.setValueAt(cantidadExistente, selectedRow, 4);
        model.setValueAt(fechaVencimiento, selectedRow, 5);
        model.setValueAt(codigoAprobacion, selectedRow, 6);
        model.setValueAt(temperaturaRefrigeracion, selectedRow, 7);
        model.setValueAt(pesoEnvase, selectedRow, 8);
        model.setValueAt(fechaEnvasado, selectedRow, 9);
        model.setValueAt(seleccion2, selectedRow, 10);
        model.setValueAt (descripcion, selectedRow, 11);
        
        
        
    }
        
        Limpiar();
    }//GEN-LAST:event_jButton_ActualizarActionPerformed

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_jButton_SalirActionPerformed

    private void jButton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable_Productos.getSelectedRow(); // Supongamos que jTable es el nombre de tu tabla
    if (selectedRow >= 0) {
        model.removeRow(selectedRow);
        
    }
    Limpiar();
    }//GEN-LAST:event_jButton_EliminarActionPerformed

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
            java.util.logging.Logger.getLogger(RegProducto_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegProducto_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegProducto_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegProducto_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegProducto_1().setVisible(true);
            }
        });
    }
    
    public void Limpiar(){
    
    jTextField_Nombre.setText("");
    jTextField_Codigo.setText("");
    jTextField_ValorUnitario.setText("");
    jTextField_CantidadExistente.setText("");
    jTextField_FechaVencimiento.setText("");
    jTextField_CodigoAprobacion.setText("");
    jTextField_TemperaturaRefrigeracion.setText("");
    jTextField_PesoEnvase.setText("");
    jTextField_FechaEnvasado.setText("");
    jTextPane_Descripcion.setText("");
    jComboBoxTipoProducto.setSelectedItem("");
    
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JButton jButton_Registrar;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JComboBox<String> jComboBoxTipoProducto;
    private javax.swing.JComboBox<String> jComboBox_Pais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_Productos;
    private javax.swing.JTextField jTextField_CantidadExistente;
    private javax.swing.JTextField jTextField_Codigo;
    private javax.swing.JTextField jTextField_CodigoAprobacion;
    private javax.swing.JTextField jTextField_FechaEnvasado;
    private javax.swing.JTextField jTextField_FechaVencimiento;
    private javax.swing.JTextField jTextField_Nombre;
    private javax.swing.JTextField jTextField_PesoEnvase;
    private javax.swing.JTextField jTextField_TemperaturaRefrigeracion;
    private javax.swing.JTextField jTextField_ValorUnitario;
    private javax.swing.JTextPane jTextPane_Descripcion;
    // End of variables declaration//GEN-END:variables
}
