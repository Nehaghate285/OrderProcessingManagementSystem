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
public class AddData {
    
    public void setInitialValues(SupplierDirectory supplierDirectory)
            
    {
        //SupplierDirectory supplierDirectory = supplierDirectory;
        
       Supplier supplier1 = new Supplier();
               
       Supplier supplier2 = new Supplier();
       
               
       supplier1.setSupplierName("supp1");
       supplier2.setSupplierName("supp2");
        
       supplierDirectory.addSupplier(supplier1);
        supplierDirectory.addSupplier(supplier2);
        Product product1 = new Product();
        
        
        //drug1.setDrugID(1);
        product1.setProductName("laptop");
        product1.setCeilingPrice(100);
        product1.setFloorPrice(50);
        product1.setAvailibility(40);
        product1.setTargetPrice(70);
        
        supplier1.getProductCatalog().addProduct(product1);
        
        Product product2 = new Product();
        //drug2.setDrugID(2);
        product2.setProductName("keyboard");
        product2.setCeilingPrice(60);
        product2.setFloorPrice(20);
        product2.setAvailibility(70);
        product2.setTargetPrice(30);
        supplier1.getProductCatalog().addProduct(product2);
        
        Product product3 = new Product();
        //drug12.setDrugID(3);
         product3.setProductName("piano");
        product3.setCeilingPrice(60);
        product3.setFloorPrice(20);
        product3.setAvailibility(70);
        product3.setTargetPrice(30);
        
        supplier2.getProductCatalog().addProduct(product3);
        
    }
    public void setStoreInitialValues(SalesPersonDirectory salesPersonDirectory){
        SalesPersonDirectory sd = salesPersonDirectory;
        
        SalesPerson salesperson1 = new SalesPerson();
        
        SalesPerson salesperson2 = new SalesPerson();
        
        SalesPerson salesperson3 = new SalesPerson();
        
        SalesPerson salesperson4 = new SalesPerson();
        
        
        salesperson1.setSalesPersonName("ramu 1");
        
        sd.addSalesPerson(salesperson1);
        
        salesperson2.setSalesPersonName("shamu 2");
        sd.addSalesPerson(salesperson2);
        
         salesperson3.setSalesPersonName("adam");
        
        sd.addSalesPerson(salesperson3);
        
        salesperson4.setSalesPersonName("kevin");
        sd.addSalesPerson(salesperson4);
        
       
    }
    
    
    public void setCustomerValues(CustomerDirectory customerDirectory){
        
        Customer c1 = new Customer();
        
        Customer c2 =  new Customer();
        
        c1.setCustomerName("customer 1");
        c2.setCustomerName("Customer 2");
        
        customerDirectory.addCustomer(c1);
        customerDirectory.addCustomer(c2);
    }
            
                
}
