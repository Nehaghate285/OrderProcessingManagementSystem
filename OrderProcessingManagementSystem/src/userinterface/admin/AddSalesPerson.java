/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.admin;


import business.SalesPerson;
import business.SalesPersonDirectory;
import business.Validator;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Neha Ghate
 */
public class AddSalesPerson extends javax.swing.JPanel {

    /**
     * Creates new form AddSalesPerson
     */
    private JPanel userProcessContainer;
    private SalesPersonDirectory salesPersonDirectory;
    private Validator validator;
    public AddSalesPerson(JPanel userProcessContainer, SalesPersonDirectory salesPersonDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.salesPersonDirectory = salesPersonDirectory;
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
        storeNameJText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addStoreJButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        errorInName = new javax.swing.JLabel();
        errorInLocation = new javax.swing.JLabel();

        jLabel1.setText("Name");

        jLabel5.setText("New  SalesPerson");

        addStoreJButton.setText("ADD SalesPerson");
        addStoreJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStoreJButtonActionPerformed(evt);
            }
        });

        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        errorInName.setForeground(new java.awt.Color(255, 0, 0));

        errorInLocation.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(addStoreJButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(storeNameJText, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorInName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(errorInLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorInName, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(storeNameJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorInLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(addStoreJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addStoreJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStoreJButtonActionPerformed

        String name = storeNameJText.getText();
        SalesPerson salesPerson = new SalesPerson();
         
        validator = new Validator();

        ArrayList<String> errorArray = new ArrayList();
        
        
        if(validator.isStringValid(name)){
            salesPerson.setSalesPersonName(name);
            errorInName.setText("");
        }
        else
        {
           // errorInName.setText("Store name cannot be empty");
            errorArray.add("salesPerson name");
        }
        
      
        //Check is done if the errorArray contains error messages
        if(!errorArray.isEmpty()){
        //System.out.print("test1");
        
        String message = "";
        //Iterate the errorListArray with foreach
        for( String error : errorArray )
            {
                message += error + " \n";
            }
            JOptionPane.showMessageDialog(null,message +"are empty fields. Please enter the values.","Error ",JOptionPane.ERROR_MESSAGE);   
        }
        else{
            salesPersonDirectory.addSalesPerson(salesPerson);
        JOptionPane.showMessageDialog(null, "SalesPerson is added","SalesPerson Addition",JOptionPane.INFORMATION_MESSAGE);       
        
        }
                
    }//GEN-LAST:event_addStoreJButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed
public void backAction()
{
    //add refresh button and also call populateTable
    userProcessContainer.remove(this);
    Component[] componentArray = userProcessContainer.getComponents();
    Component component = componentArray[componentArray.length - 1 ];
    ManageSalesPerson manageStoreJPanel = (ManageSalesPerson) component;
    manageStoreJPanel.populateTable();
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.previous(userProcessContainer);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStoreJButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel errorInLocation;
    private javax.swing.JLabel errorInName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField storeNameJText;
    // End of variables declaration//GEN-END:variables
}