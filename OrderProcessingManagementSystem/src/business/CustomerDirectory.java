/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Neha Ghate
 */
public class CustomerDirectory {
    
      private ArrayList<Customer> customerList;
      
      public CustomerDirectory(){
          customerList = new ArrayList<Customer>();
      }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    
    public Customer addCustomer(Customer customer){
        //Store store = new SalesPerson();
        customerList.add(customer);
        return customer;
    }
    public void removeSalesPerson(Customer customer){
        customerList.remove(customer);
    }
    
     public Customer getPopularCustomer(){
        
        Collections.sort(customerList);
        
        Customer popularCustomer = customerList.get(0);
        
        return popularCustomer;
    
   }
    
}
