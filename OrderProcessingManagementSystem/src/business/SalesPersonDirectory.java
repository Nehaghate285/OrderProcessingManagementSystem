/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author Neha Ghate
 */
public class SalesPersonDirectory {
    
    ArrayList<SalesPerson> salesPersonList;
    
    public SalesPersonDirectory(){
        this.salesPersonList = new ArrayList<>();
    }

    public ArrayList<SalesPerson> getSalesPersonList() {
        return salesPersonList;
    }

    public void setSalesPersonList(ArrayList<SalesPerson> salesPersonList) {
        this.salesPersonList = salesPersonList;
    }
    
    public SalesPerson addSalesPerson(SalesPerson salesPerson){
        //Store store = new SalesPerson();
        salesPersonList.add(salesPerson);
        return salesPerson;
    }
    public void removeSalesPerson(SalesPerson salesPerson){
        salesPersonList.remove(salesPerson);
    }
    
    public ArrayList<SalesPerson> getGoodSalesPerson(){
                  //Calling of the sorting method
       // ArrayList<SalesPerson> ; 
                 Collections.sort(salesPersonList);
              //ArrayList<SalesPerson> top3;
//              top3 = new ArrayList<SalesPerson>(salesPersonList.subList(salesPersonList.size() -3, salesPersonList.size()));
            //System.out.println("salesperson :"+ s.getSalesPersonName() + " amount:" + totalAmount);
                 
                  System.out.println("------ AFTER SORTING----");
        for(SalesPerson SPafterSorting:salesPersonList){
            System.out.println(SPafterSorting.getSalesPersonName()+"#, Amount="+SPafterSorting.getTotalAmount());
        }
        
        return salesPersonList;
            }
    
   public HashMap<String, Integer> getProductSoldBelowTarget(){
         
         int totalProducts = 0;
         HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        for(SalesPerson sp : salesPersonList){
            totalProducts = 0;
                 for(Order o : sp.getMasterOrderCatalog().getOrderCatalog()){
                      for(OrderItem orderItem : o.getOrderItemList()){
                         if(orderItem.getSalesPrice() < orderItem.getProduct().getTargetPrice() ){
                            totalProducts++; 
                         }
                          
                     }
                    
                 }
                 hmap.put(sp.getSalesPersonName(), totalProducts);
         }
        
       
        return hmap;  
   }
   
   
    public HashMap<String, Integer> getProductSoldAboveTarget(){
         
         int totalProducts = 0;
         HashMap<String, Integer> hmap = new HashMap<String, Integer>();
         
        for(SalesPerson sp : salesPersonList){
            totalProducts = 0;
                 for(Order o : sp.getMasterOrderCatalog().getOrderCatalog()){
                      for(OrderItem orderItem : o.getOrderItemList()){
                         if(orderItem.getSalesPrice() > orderItem.getProduct().getTargetPrice() ){
                            totalProducts++; 
                         }
                          
                     }
                 }
                 hmap.put(sp.getSalesPersonName(), totalProducts);
              //  System.out.println();  
                //    System.out.println(totalProducts);  
         }
        
       
        return hmap;  
   }
   
   
    
    
}