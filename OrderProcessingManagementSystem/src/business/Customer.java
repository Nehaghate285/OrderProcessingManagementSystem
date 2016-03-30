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
public class Customer implements Comparable<Customer>{
    
    private String customerName;
    
    private int customerID;
    
    private int totalAmount;
    
    private static int count ;

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    public Customer(){
        customerID = count++;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return customerName;
    }
    
     @Override
    public int compareTo(Customer c) {
       if( this.totalAmount > c.getTotalAmount()){
           return -1;
       }else if (this.totalAmount < c.getTotalAmount()){
            return 1;
       }else{
           
        return 0;
    }
        
    }
    
    
}
