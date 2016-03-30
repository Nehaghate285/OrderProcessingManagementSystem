package userinterface.admin;


import business.Product;
import business.ProductCatalog;
import business.Supplier;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class ViewSupplierCompany extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Supplier supplier;
    public ViewSupplierCompany(JPanel userProcessConatiner, Supplier supplier) {
        initComponents();
        this.userProcessContainer =  userProcessConatiner;
        this.supplier = supplier;
//        addDrugsJButton.setEnabled(false);
        populateTable();
        supplierNameLabelName.setText(supplier.getSupplierName()); //to get supplier name as label above the abv
    }
    
    public void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) drugsCatalogJTable.getModel();
        dtm.setRowCount(0); //to make row count 0
       // int rowCount = accountJTable.getRowCount();
        for (Product product : supplier.getProductCatalog().getProductList())
        {
           Object[] row = new Object[5];
            row[0]=product;
            row[1]=product.getAvailibility();
            row[2]=product.getFloorPrice();
            row[3]=product.getTargetPrice();
            row[4]=product.getCeilingPrice();
            
            dtm.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        supplierNameLabelName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        addProductsJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        drugsCatalogJTable = new javax.swing.JTable();

        supplierNameLabelName.setText("jLabel1");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        addProductsJButton.setText("Add Products");
        addProductsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductsJButtonActionPerformed(evt);
            }
        });

        drugsCatalogJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Product Availibility", "Floor Price", "Target Price", "Ceiling Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(drugsCatalogJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(supplierNameLabelName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(addProductsJButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(359, 359, 359))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(supplierNameLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addProductsJButton)
                .addGap(81, 81, 81)
                .addComponent(btnBack)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void addProductsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductsJButtonActionPerformed
        // TODO add your handling code here:
        ProductCatalog productCatalog = supplier.getProductCatalog();
        AddProductsJPanel addDrugsJPanel = new AddProductsJPanel(userProcessContainer,productCatalog);
        userProcessContainer.add("addDrugsJPanel",addDrugsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addProductsJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductsJButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JTable drugsCatalogJTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel supplierNameLabelName;
    // End of variables declaration//GEN-END:variables
}
