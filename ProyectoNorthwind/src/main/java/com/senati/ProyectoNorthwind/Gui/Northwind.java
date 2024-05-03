/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.senati.ProyectoNorthwind.Gui;

import com.senati.ProyectoNorthwind.Miclase.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author PAMELA FIGUEROA
 */
public class Northwind extends javax.swing.JFrame {

    Conexion obj = new Conexion();
    public Northwind() {
        initComponents();
        ListarCustomers();
        cargarCountry();
        cargarRegion();
        CargarCity();
        btnBuscar.setEnabled(true);
        btnLimpiar.setEnabled(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtCompany = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtContactTitle = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cboRegion = new javax.swing.JComboBox<>();
        cboCountry = new javax.swing.JComboBox<>();
        txtCodigo = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtFax = new javax.swing.JTextField();
        cboCity = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLista = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("CustomerID");

        jLabel2.setBackground(new java.awt.Color(153, 153, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("CompanyName");

        jLabel3.setBackground(new java.awt.Color(153, 153, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("ContactName");

        jLabel4.setBackground(new java.awt.Color(153, 153, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("ContactTitle");

        jLabel5.setBackground(new java.awt.Color(153, 153, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Address");

        jLabel6.setBackground(new java.awt.Color(153, 153, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("City");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(153, 153, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Region");

        jLabel8.setBackground(new java.awt.Color(153, 153, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Country");

        jLabel9.setBackground(new java.awt.Color(153, 153, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Codigo Postal");

        jLabel10.setBackground(new java.awt.Color(153, 153, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Phone");

        jLabel11.setBackground(new java.awt.Color(153, 153, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Fax");

        btnGuardar.setBackground(new java.awt.Color(255, 51, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 51, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 51, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 51, 255));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        tbLista.setAutoCreateRowSorter(true);
        tbLista.setBackground(new java.awt.Color(153, 204, 255));
        tbLista.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbLista);

        btnLimpiar.setBackground(new java.awt.Color(255, 51, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboCity, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContactTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo)
                            .addComponent(cboCountry, 0, 157, Short.MAX_VALUE)
                            .addComponent(txtPhone)
                            .addComponent(txtFax)
                            .addComponent(cboRegion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 997, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContactTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void tbListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListaMouseClicked
        // TODO add your handling code here:
         int y;
        
        try{
            y=tbLista.getSelectedRow();
           
                 if (y == -1){
                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila.");
            } else {
               

               
                txtID.setText((String) tbLista.getValueAt(y, 0));
                txtCompany.setText((String) tbLista.getValueAt(y, 1 ));
                txtContact.setText((String) tbLista.getValueAt(y, 2));
                txtContactTitle.setText((String) tbLista.getValueAt(y, 3));
                txtAddress.setText((String) tbLista.getValueAt(y, 4));
                txtCodigo.setText((String) tbLista.getValueAt(y, 7));
                txtPhone.setText((String) tbLista.getValueAt(y, 9));
                txtFax.setText((String) tbLista.getValueAt(y, 10));
               }
             
                 
                
  
                           
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }




    }//GEN-LAST:event_tbListaMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        GrabarCustomers();
        ListarCustomers();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
        String cod=(JOptionPane.showInputDialog("Escribe el ID Customers"));
        txtID.setText("" + cod);
        BuscarCustomers(cod);
          btnActualizar.setEnabled(true);
          btnEliminar.setEnabled(true);
          btnGuardar.setEnabled(true);
          btnBuscar.setEnabled(false);
          btnLimpiar.setEnabled(false);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
        btnEliminar.setEnabled(false);
        btnBuscar.setEnabled(true);
        btnActualizar.setEnabled(true);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String cod=txtID.getText();
        txtID.setText("" + cod);
        
        EliminarCustomers(cod);
        ListarCustomers();
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
         String cod = txtID.getText();
             String ComanyName  = txtCompany.getText();
             String ContactName = txtContact.getText();
             String ContactTitle = txtContactTitle.getText();
             String Address = txtAddress.getText();
             String City = cboCity.getSelectedItem().toString();
             String Region = cboRegion.getSelectedItem().toString();
             String CodPostal  = txtCodigo.getText();
             String Country = cboCountry.getSelectedItem().toString();
             String Phone  = txtPhone.getText();
             String fax  = txtFax.getText();
         actualizarCustomers(cod, ComanyName, ContactName, ContactTitle, Address, City, Region, CodPostal, Country, Phone, fax);
        ListarCustomers();
                btnGuardar.setEnabled(false);
                btnEliminar.setEnabled(false);
                btnBuscar.setEnabled(true);
                btnLimpiar.setEnabled(true);
                limpiar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    
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
            java.util.logging.Logger.getLogger(Northwind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Northwind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Northwind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Northwind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Northwind().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cboCity;
    private javax.swing.JComboBox<String> cboCountry;
    private javax.swing.JComboBox<String> cboRegion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLista;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtContactTitle;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
void limpiar(){
	txtID.setText(null);
	txtCompany.setText(null);
        txtContact.setText(null);
        txtContactTitle.setText(null);
        txtAddress.setText(null);
        txtCodigo.setText(null);
        txtPhone.setText(null);
        txtFax.setText(null);
	txtID.requestFocus();
}

void mensaje(String men){
	JOptionPane.showMessageDialog(this, men);
}
    
void ListarCustomers(){
    
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("CustomerID");
    modelo.addColumn("CompanyName");
    modelo.addColumn("ContactName");
    modelo.addColumn("ContactTitle");
    modelo.addColumn("Address");
    modelo.addColumn("City");
    modelo.addColumn("Region");
    modelo.addColumn("Codigo Postal");
    modelo.addColumn("Country");
    modelo.addColumn("Phone");
    modelo.addColumn("Fax");
    
    try{
	obj.obtenerConexion();
	obj.pst=obj.conectar.prepareStatement("select * from Customers;");
	obj.rs=obj.pst.executeQuery();
	while(obj.rs.next()){
		
		Object datos[]=new Object[11];
		for(int i=0;i<11;i++){
			datos[i]=obj.rs.getString(i+1);
			
		}
		modelo.addRow(datos);
		
	}
	tbLista.setModel(modelo);
	obj.rs.close();
	obj.conectar.close();
		
		
		
	}catch(SQLException e){
		e.getMessage().toString();
	}
	
}

void CargarCity (){
    try{
        obj.obtenerConexion();
        obj.pst=obj.conectar.prepareStatement("select distinct City from Customers;");
        obj.rs=obj.pst.executeQuery();
        while(obj.rs.next())
            cboCity.addItem(obj.rs.getString(1));
        obj.rs.close();
        obj.conectar.close();
  
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e.toString()); 
    }
    
    
}

void cargarRegion(){
    try{
        obj.obtenerConexion();
        obj.pst=obj.conectar.prepareStatement("select distinct Region from Customers;");
        obj.rs=obj.pst.executeQuery();
        while(obj.rs.next())
            cboRegion.addItem(obj.rs.getString(1));
        obj.rs.close();
        obj.conectar.close();
  
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e.toString()); 
    }
    
    
}

void cargarCountry(){
    try{
        obj.obtenerConexion();
        obj.pst=obj.conectar.prepareStatement("select distinct Country from Customers;");
        obj.rs=obj.pst.executeQuery();
        while(obj.rs.next())
            cboCountry.addItem(obj.rs.getString(1));
        obj.rs.close();
        obj.conectar.close();
  
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e.toString()); 
    }
    
    

}




void GrabarCustomers (){
    
    int x = JOptionPane.showConfirmDialog(null, "Desea grabar Registros", "Pregunta", 0);
    
    if(x==0){
        try {
            
            obj.obtenerConexion();
            
            String codigo = txtID.getText();
            String Company = txtCompany.getText();
            String ContactName = txtContact.getText();
            String ContactTitle = txtContactTitle.getText();
            String Adres = txtAddress.getText();
            String City = cboCity.getSelectedItem().toString();
            String Region = cboRegion.getSelectedItem().toString();
            String CodPostal = txtCodigo.getText();
            String country = cboCountry.getSelectedItem().toString(); 
            String phone = txtPhone.getText();
            String fax = txtFax.getText();
            
            
            
            String captura = "Insert into Customers(CustomerID, CompanyName, ContactName, ContactTitle, Address, City, Region, PostalCode,Country, Phone, Fax) Values";
            captura=captura+"('"+codigo+"','"+Company+"','"+ContactName+"','"+ContactTitle+"','"+Adres+"','"+City+"','"+Region+"','"+CodPostal+"','"+country+"','"+phone+"','"+fax+"')";
            obj.st = obj.conectar.createStatement();
            obj.st.executeUpdate(captura);
            obj.conectar.close();
            limpiar();
            
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede guardar, el codigo es duplicado","Error",0);
            System.out.println(e.toString());
        } 
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "faltan llenar datos", "Aviso", 0);
            System.out.println(ex.toString());
        }
    }
}
    
void BuscarCustomers(String cod) {
     try{
        obj.obtenerConexion();
        obj.pst = obj.conectar.prepareStatement("select CustomerID, CompanyName, ContactName, ContactTitle, Address, City, Region, PostalCode, Country, Phone, Fax from Customers where CustomerID = ?;");
        obj.pst.setString(1, cod);
        obj.rs = obj.pst.executeQuery();
        if(obj.rs.next()) {
            txtID.setText(obj.rs.getString("CustomerID"));
            txtCompany.setText(obj.rs.getString("CompanyName"));
            txtContact.setText(obj.rs.getString("ContactName"));
            txtContactTitle.setText(obj.rs.getString("ContactTitle"));
            txtAddress.setText(obj.rs.getString("Address"));
            String City = obj.rs.getString("City");
            cboCity.setSelectedItem(City);
            String Region = obj.rs.getString("Region");
            cboRegion.setSelectedItem(Region);
            txtCodigo.setText(obj.rs.getString("PostalCode"));
            String Country = obj.rs.getString("Country");
            cboCountry.setSelectedItem(Country);
            txtPhone.setText(obj.rs.getString("Phone"));
            txtFax.setText(obj.rs.getString("Fax"));
        }else{
            mensaje("El id No existe");
            limpiar();
        }
        obj.rs.close();
        obj.conectar.close();
        
        
    }catch(SQLException e){
        mensaje(e.toString());
    }
      
     } 

void EliminarCustomers(String cod){
     
	
	try{
		obj.obtenerConexion();
		
               obj.pst=obj.conectar.prepareStatement("DELETE FROM Customers WHERE CustomerID = ?;");
               obj.pst.setString(1, cod);
               obj.pst.executeUpdate();
               mensaje("Datos eliminados");
               obj.conectar.close();

	}catch(SQLException x){
		System.out.print(x.toString());
	}
        
        
        
 }
  
 void actualizarCustomers(String cod, String CompanyName, String ContactName, String ContactTitle, String Address, String City, String Region, String CodPostal, String Country, String Phone, String Fax) {
        try {
            obj.obtenerConexion();
            PreparedStatement statement = obj.conectar.prepareStatement
            ("update Customers set CompanyName=?, ContactName=?, ContactTitle=?, Address=?, City=?, Region=?, PostalCode =?, Country= ?,Phone = ?, Fax=?   where CustomerID=?");
            
            statement.setString(1, CompanyName);
            statement.setString(2, ContactName);
            statement.setString(3, ContactTitle);
            statement.setString(4, Address);
            statement.setString(5, City);
            statement.setString(6, Region); 
            statement.setString(7, CodPostal);
            statement.setString(8, Country);
            statement.setString(9, Phone);
            statement.setString(10, Fax);
            statement.setString(11, cod);
            statement.executeUpdate();

            mensaje("Datos en la tabla Costumers actualizados correctamente.");
            ListarCustomers();

            statement.close();
            obj.conectar.close();
        }catch (SQLException xx) {
            mensaje("Error al actualizar los datos de la tabla Costumers: "+xx.toString());
        }
    }
     
     
      
     
     
 }
 





    
    







