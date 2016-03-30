/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.admin;

import business.Supplier;
import business.SupplierDirectory;
import business.Validator;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Neha Ghate
 */
public class AddSupplier extends javax.swing.JPanel {

    /**
     * Creates new form AddSupplier
     */
    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    private Validator validator;
    
    public AddSupplier(JPanel userProcessContainer,SupplierDirectory supplierDirectory) {
        this.userProcessContainer = userProcessContainer;
        this.supplierDirectory = supplierDirectory;
        initComponents();
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
        pharmacyNameJText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addSupplierJButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        errorInName = new javax.swing.JLabel();

        jLabel1.setText("Name");

        jLabel5.setText("New Pharmacy Store");

        addSupplierJButton.setText("ADD SUPPLIER");
        addSupplierJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSupplierJButtonActionPerformed(evt);
            }
        });

        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        errorInName.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(addSupplierJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(errorInName))
                            .addComponent(pharmacyNameJText, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pharmacyNameJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorInName)
                .addGap(30, 30, 30)
                .addComponent(addSupplierJButton)
                .addGap(126, 126, 126)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addSupplierJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSupplierJButtonActionPerformed
        
        String name = pharmacyNameJText.getText();
        Supplier supplier = new Supplier();
// pharmacyDirectory.addPharmacy();
        validator = new Validator();
        
        if(validator.isStringValid(name)){
        supplier.setSupplierName(name);
        errorInName.setText("");
        supplierDirectory.addSupplier(supplier);
        JOptionPane.showMessageDialog(null, "supplier is added","supplier Addition",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            errorInName.setText("supplier name cannot be empty");
        }

        
    }//GEN-LAST:event_addSupplierJButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSupplierJButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel errorInName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField pharmacyNameJText;
    // End of variables declaration//GEN-END:variables
}