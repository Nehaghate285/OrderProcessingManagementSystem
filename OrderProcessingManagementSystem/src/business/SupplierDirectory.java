/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author Neha Ghate
 */
public class SupplierDirectory {
    
    ArrayList<Supplier> supplierList;

    public SupplierDirectory(){
        this.supplierList =  new ArrayList<>();
    }

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> supplierList) {
        this.supplierList = supplierList;
    }
   
    public Supplier addSupplier(Supplier supplier) {

        //Pharmacy pharma = new Supplier();
        supplierList.add(supplier);
        return supplier;
    }

    public void removeSupplier(Supplier supplier) {
     supplierList.remove(supplier);
    }

    public Product searchProduct(int productID)
    {
        for(Supplier s : supplierList){
        for(Product product : s.getProductCatalog().getProductList()){
            if(productID == product.getProductID())
                return product;
        }
         }
        return null;
    }
}
