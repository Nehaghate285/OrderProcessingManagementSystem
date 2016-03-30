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
public class SalesPerson implements Comparable<SalesPerson>{
    
    private String salesPersonName;
    private int salesPersonID;
    private static int count = 1000;
    private MasterOrderCatalog masterOrderCatalog;
    private int totalAmount;

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
    
     public SalesPerson(){
        masterOrderCatalog = new MasterOrderCatalog();
        salesPersonID = count++;
    }
    
    
    public String getSalesPersonName() {
        return salesPersonName;
    }

    public void setSalesPersonName(String salesPersonName) {
        this.salesPersonName = salesPersonName;
    }

    public int getSalesPersonID() {
        return salesPersonID;
    }

    public void setSalesPersonID(int salesPersonID) {
        this.salesPersonID = salesPersonID;
    }
   
   
    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }
    
     @Override
    public int compareTo(SalesPerson s) {
       if( this.totalAmount > s.getTotalAmount()){
           return -1;
       }else if (this.totalAmount < s.getTotalAmount()){
            return 1;
       }else{
           
        return 0;
    }
        
    }
    
     @Override
    public String toString() {
        //return "SalesPerson{" + "storeName=" + storeName + '}';
        return getSalesPersonName();
    }
    
}
