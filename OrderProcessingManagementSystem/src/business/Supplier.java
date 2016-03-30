/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author Neha Ghate
 */
public class Supplier {
    
    private String supplierName;
    private int supplierID;
   // private String pharmaLocation;
    private ProductCatalog productCatalog;

    @Override
    public String toString() {
        //return "Supplier{" + "pharmaName=" + pharmaName + '}';
        return supplierName;
    }

    public Supplier(){
        productCatalog = new ProductCatalog();
    }
    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }
    
}
