/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essar.screens;

import com.essar.dao.SupplierDAO;
import com.essar.utils.TableMouseListener;
import com.essar.pojos.Supplier;
import com.essar.utils.GenericUtils;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author rahumathulla
 */
public class SupplierForm extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form ProductCategory
     */
    int supplierId=0;
    DefaultTableModel supplierModel = null;
    public SupplierForm() {
        initComponents();
        initializeForm();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/tienda.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        mnuSupplier = new javax.swing.JPopupMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        mitDelete = new javax.swing.JMenuItem();
        mitEdit = new javax.swing.JMenuItem();
        pnlSupplier = new javax.swing.JPanel();
        lblProductCategoryName = new javax.swing.JLabel();
        lblProductCategoryCode1 = new javax.swing.JLabel();
        txtSupplierCode = new javax.swing.JTextField();
        txtSupplierName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        spnSupplierDetails = new javax.swing.JScrollPane();
        tblSupplier = new javax.swing.JTable();
        lblProductCategoryName1 = new javax.swing.JLabel();
        lblProductCategoryName2 = new javax.swing.JLabel();
        txtSupplierRating = new javax.swing.JTextField();
        lblProductCategoryName3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSupplierAddress = new javax.swing.JTextArea();
        txtSupplierContactNumber = new javax.swing.JTextField();
        lblCount = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable2);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        mitDelete.setText("jMenuItem1");

        mitEdit.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Supplier Form");
        setIconImage(getIconImage());
        setName("frmProductCategory"); // NOI18N

        lblProductCategoryName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblProductCategoryName.setText("Supplier Name");

        lblProductCategoryCode1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblProductCategoryCode1.setText("GSTIN of Supplier ");

        txtSupplierCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtSupplierName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        btnSave.setMnemonic('S');
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        btnCancel.setMnemonic('C');
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        tblSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GSTIN", "Supplier Name", "Contact Number", "Rating", "Address", "id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spnSupplierDetails.setViewportView(tblSupplier);

        lblProductCategoryName1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblProductCategoryName1.setText("Supplier Contact Number");

        lblProductCategoryName2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblProductCategoryName2.setText("Supplier Address");

        txtSupplierRating.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblProductCategoryName3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblProductCategoryName3.setText("Supplier Rating (out of 5)");

        txtSupplierAddress.setColumns(10);
        txtSupplierAddress.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtSupplierAddress.setRows(3);
        txtSupplierAddress.setTabSize(3);
        jScrollPane3.setViewportView(txtSupplierAddress);

        txtSupplierContactNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCount.setForeground(new java.awt.Color(102, 102, 255));
        lblCount.setText("Count:");

        javax.swing.GroupLayout pnlSupplierLayout = new javax.swing.GroupLayout(pnlSupplier);
        pnlSupplier.setLayout(pnlSupplierLayout);
        pnlSupplierLayout.setHorizontalGroup(
            pnlSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSupplierLayout.createSequentialGroup()
                        .addGroup(pnlSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlSupplierLayout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancel))
                            .addGroup(pnlSupplierLayout.createSequentialGroup()
                                .addGroup(pnlSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProductCategoryCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblProductCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblProductCategoryName2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblProductCategoryName1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(pnlSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtSupplierName)
                                        .addComponent(txtSupplierCode)
                                        .addComponent(txtSupplierContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlSupplierLayout.createSequentialGroup()
                        .addGroup(pnlSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnSupplierDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlSupplierLayout.createSequentialGroup()
                                .addComponent(lblProductCategoryName3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(txtSupplierRating, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCount, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlSupplierLayout.setVerticalGroup(
            pnlSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSupplierLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProductCategoryCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSupplierCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductCategoryName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProductCategoryName1)
                    .addComponent(txtSupplierContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProductCategoryName3)
                    .addComponent(txtSupplierRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProductCategoryName2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnSupplierDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(btnSave.getText().equalsIgnoreCase("add")){
            btnSave.setText("Save");
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png")));
            enableFormElements(true);
            txtSupplierRating.setText("4");
            txtSupplierCode.requestFocus();
        }else{
            //Implement Save Logic
            if(validateForm()){
                if(supplierId>0)
                    updateSupplierForm();
                else
                    saveSupplierForm();
                initializeForm();               
                
            }           
            
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(SupplierForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplierForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplierForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplierForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupplierForm().setVisible(true);
            }
        });
    }
    
    public void initializeForm(){
        supplierId=0;
        DefaultTableModel model = (DefaultTableModel) tblSupplier.getModel();
        model.setRowCount(0);
        
        btnSave.setText("Add");
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png")));
        btnSave.requestFocus();
        txtSupplierCode.setText("");
        txtSupplierName.setText("");
        txtSupplierRating.setText("");
        txtSupplierContactNumber.setText("");
        txtSupplierAddress.setText("");

        enableFormElements(false);
        SupplierDAO supplierDAO = new SupplierDAO();
        renderDataIntoTable(supplierDAO.retrieveAll());
        mnuSupplier = new JPopupMenu();
        
        mitEdit = new JMenuItem("Edit");
        mitEdit.addActionListener(this);
        
        mitDelete = new JMenuItem("Delete");
        mitDelete.addActionListener(this);
        
        mnuSupplier.add(mitEdit);
        mnuSupplier.add(mitDelete);
       
         // sets the popup menu for the table
        tblSupplier.setComponentPopupMenu(mnuSupplier);      
        tblSupplier.addMouseListener(new TableMouseListener(tblSupplier));
        tblSupplier.setAutoCreateRowSorter(true);
        TableColumn idColumn1 = tblSupplier.getColumnModel().getColumn(tblSupplier.getColumnCount()-1);
        idColumn1.setPreferredWidth(0);
        idColumn1.setMinWidth(0);
        idColumn1.setMaxWidth(0);
        
        TableColumn addressColumn = tblSupplier.getColumnModel().getColumn(tblSupplier.getColumnCount()-2);
        addressColumn.setPreferredWidth(400);
        addressColumn.setMinWidth(400);
        addressColumn.setMaxWidth(400);
        
        TableColumn ratingColumn = tblSupplier.getColumnModel().getColumn(tblSupplier.getColumnCount()-3);
        ratingColumn.setPreferredWidth(60);
        ratingColumn.setMinWidth(60);
        ratingColumn.setMaxWidth(60);
        
        TableColumn supplierNameColumn = tblSupplier.getColumnModel().getColumn(1);
        supplierNameColumn.setPreferredWidth(200);
        supplierNameColumn.setMinWidth(200);
        supplierNameColumn.setMaxWidth(200);
        
        TableColumn gstColumn = tblSupplier.getColumnModel().getColumn(0);
        gstColumn.setPreferredWidth(140);
        gstColumn.setMinWidth(140);
        gstColumn.setMaxWidth(140);
   
    }
    
    public void enableFormElements(boolean flag){
        txtSupplierCode.setEnabled(flag);
        txtSupplierName.setEnabled(flag);
        txtSupplierContactNumber.setEnabled(flag);
        txtSupplierRating.setEnabled(flag);
        txtSupplierAddress.setEnabled(flag);
    }
    public boolean validateForm(){
        //btnSave.setText("Add");
        //btnSave.requestFocus();
        if(null == txtSupplierCode.getText() || !(txtSupplierCode.getText().matches("\\w+"))){
            JOptionPane.showMessageDialog(null, "Supplier GST# "+txtSupplierCode.getText() +" is not valid.");
            return false;
        }
        if(null == txtSupplierName.getText()){
            JOptionPane.showMessageDialog(null, "Supplier name "+txtSupplierName.getText() +" is not valid.");
            return false;
        }
        if(null == txtSupplierContactNumber.getText() || !(txtSupplierContactNumber.getText().matches("\\d{10}"))){
            JOptionPane.showMessageDialog(null, "Contact number "+txtSupplierContactNumber.getText() +" is not valid.");
            return false;
        }
        if(null == txtSupplierRating.getText() || !(txtSupplierRating.getText().matches("\\d{1}"))){
            JOptionPane.showMessageDialog(null, "Rating "+txtSupplierRating.getText() +" is not valid.");
            return false;
        }
        //txtProductCategoryName.setText("");
        return true;
    }
    
    public void saveSupplierForm(){
 
        Supplier supplier = new Supplier();
        supplier.setSupplierCode(txtSupplierCode.getText());
        supplier.setSupplierName(txtSupplierName.getText());
        supplier.setSupplierContactNumber(txtSupplierContactNumber.getText());
        supplier.setSupplierRating(txtSupplierRating.getText());
        supplier.setSupplierAddress(txtSupplierAddress.getText());
        SupplierDAO supplierDAO = new SupplierDAO();
        supplierDAO.insertIntoDB(supplier);
        
    }
    
    public void updateSupplierForm(){
 
        Supplier supplier = new Supplier();
        supplier.setSupplierId(supplierId);
        supplier.setSupplierCode(txtSupplierCode.getText());
        supplier.setSupplierName(txtSupplierName.getText());
        supplier.setSupplierContactNumber(txtSupplierContactNumber.getText());
        supplier.setSupplierRating(txtSupplierRating.getText());
        supplier.setSupplierAddress(txtSupplierAddress.getText());
        SupplierDAO supplierDAO = new SupplierDAO();
        supplierDAO.updateRecord(supplier);
        
    }
    public void syncDataFromViewToTable(){
        Supplier supplier = null;
        System.out.println("--------INSIDE Edit-"+tblSupplier.getModel().getValueAt(tblSupplier.getSelectedRow(),0));
        supplierId = Integer.parseInt(tblSupplier.getModel().getValueAt(tblSupplier.getSelectedRow(),tblSupplier.getColumnCount()-1).toString());
        SupplierDAO supplierDAO = new SupplierDAO();
        supplier = supplierDAO.retrieveById(supplierId);
        System.out.println("--"+supplier.getSupplierName());
        txtSupplierName.setText(supplier.getSupplierName());
        txtSupplierCode.setText(supplier.getSupplierCode());
        txtSupplierContactNumber.setText(supplier.getSupplierContactNumber());
        txtSupplierRating.setText(supplier.getSupplierRating());
        txtSupplierAddress.setText(supplier.getSupplierAddress());
        enableFormElements(true);
        btnSave.setText("Update");
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png")));
    }
    public void renderDataIntoTable(List<Supplier> supplierList){
        
        supplierModel = (DefaultTableModel) tblSupplier.getModel();
        System.out.println("-----"+supplierList.size());
        lblCount.setText("Count : "+supplierList.size());
        for(int i=0;i<supplierList.size();i++){
        supplierModel.addRow(new Object[]{supplierList.get(i).getSupplierCode(),supplierList.get(i).getSupplierName(),supplierList.get(i).getSupplierContactNumber(), supplierList.get(i).getSupplierRating(), supplierList.get(i).getSupplierAddress(), supplierList.get(i).getSupplierId()});
        //model.
        }
        
        tblSupplier.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                if (me.getClickCount() == 2) {     // to detect doble click events
                    syncDataFromViewToTable();
                }
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblProductCategoryCode1;
    private javax.swing.JLabel lblProductCategoryName;
    private javax.swing.JLabel lblProductCategoryName1;
    private javax.swing.JLabel lblProductCategoryName2;
    private javax.swing.JLabel lblProductCategoryName3;
    private javax.swing.JMenuItem mitDelete;
    private javax.swing.JMenuItem mitEdit;
    private javax.swing.JPopupMenu mnuSupplier;
    private javax.swing.JPanel pnlSupplier;
    private javax.swing.JScrollPane spnSupplierDetails;
    private javax.swing.JTable tblSupplier;
    private javax.swing.JTextArea txtSupplierAddress;
    private javax.swing.JTextField txtSupplierCode;
    private javax.swing.JTextField txtSupplierContactNumber;
    private javax.swing.JTextField txtSupplierName;
    private javax.swing.JTextField txtSupplierRating;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent event) {
        try{
            JMenuItem menu = (JMenuItem) event.getSource();
            if (menu == mitDelete) {
                //int rowIndex = tblSupplier.getSelectedRow();
                System.out.println("--------INSIDE DELETE-"+tblSupplier.getModel().getValueAt(tblSupplier.getSelectedRow(),0));
                long supplierId = Long.parseLong(tblSupplier.getModel().getValueAt(tblSupplier.getSelectedRow(),tblSupplier.getColumnCount()-1).toString());
                SupplierDAO supplierDAO = new SupplierDAO();
                supplierDAO.deleteRecordById(supplierId);
                // Bug Fix for row doubling during table record deletion
                GenericUtils.removeRowFromJTable(tblSupplier, supplierModel);
            } 
            
            if (menu == mitEdit) {
                //int rowIndex = tblSupplier.getSelectedRow();
                syncDataFromViewToTable();                
            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
}

