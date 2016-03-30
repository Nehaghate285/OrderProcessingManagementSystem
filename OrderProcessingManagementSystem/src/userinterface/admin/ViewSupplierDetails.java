package userinterface.admin;


import business.Product;
import business.Supplier;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class ViewSupplierDetails extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Supplier supplier;
    public ViewSupplierDetails(JPanel userProcessConatiner,  Supplier supplier) {
        initComponents();
        this.userProcessContainer =  userProcessConatiner;
        this.supplier = supplier;
//        addDrugsJButton.setEnabled(false);
        populateTable();
        pharmacyNameLabelName.setText(supplier.getSupplierName()); //to get supplier name as label above the abv
    }
    
    public void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) drugsCatalogJTable.getModel();
        dtm.setRowCount(0); //to make row count 0
       // int rowCount = accountJTable.getRowCount();
        for (Product product : supplier.getProductCatalog().getProductList())
        {
            if(product!=null){
            Object[] row = new Object[5];
            row[0]=product;
            row[1]=product.getAvailibility();
            row[2]=product.getFloorPrice();
            row[3]=product.getTargetPrice();
            row[4]=product.getCeilingPrice();
            
            dtm.addRow(row);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pharmacyNameLabelName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        drugsCatalogJTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        pharmacyNameLabelName.setText("jLabel1");

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

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(pharmacyNameLabelName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(pharmacyNameLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(btnBack)
                .addContainerGap(184, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JTable drugsCatalogJTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pharmacyNameLabelName;
    // End of variables declaration//GEN-END:variables
}
