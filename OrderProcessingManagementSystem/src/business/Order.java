/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Neha Ghate
 */
public class Order {
    private ArrayList<OrderItem> orderItemList;
    private int orderNumber;
    private Date dateOrdered;
    private SalesPerson salesPerson;

    public Order()
    {
        orderItemList =  new ArrayList<>();
        count++;
        orderNumber=count;
        
    }
    
    public SalesPerson getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(SalesPerson salesPerson) {
        this.salesPerson = salesPerson;
    }

    public Date getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(Date dateOrdered) {
        this.dateOrdered = dateOrdered;
    }
    private static int count;

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    

    public OrderItem addOrderItem(Product p, int quantity, int price, SalesPerson salesPerson, Customer customer)
    {
        OrderItem orderItem = new OrderItem();
        orderItem.setProduct(p);
        orderItem.setQuantity(quantity);
        orderItem.setSalesPrice(price);
        orderItem.setSalesPerson(salesPerson);
        orderItem.setCustomer(customer);
        orderItemList.add(orderItem);
        return orderItem;
    }
/*
    public float calculateOrderTotal(){
        
    }*/
    
    @Override
    public String toString() {
        return String.valueOf(orderNumber);
    }
    
    public void removeOrderItem(OrderItem o)
    {
        orderItemList.remove(o);
    }
    
    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
    
}
