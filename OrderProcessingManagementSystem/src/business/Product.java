/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.Date;

/**
 *
 * @author Neha Ghate
 */
public class Product implements Comparable<Product>{
    
    private int productID;
    private String productName;
    private float ceilingPrice;
    private float floorPrice;
    private float targetPrice;
    private int availibility;
    private int productSellCount;

    public int getProductSellCount() {
        return productSellCount;
    }

    public void setProductSellCount(int productSellCount) {
        this.productSellCount = productSellCount;
    }
    

    public int getAvailibility() {
        return availibility;
    }

    public void setAvailibility(int availibility) {
        this.availibility = availibility;
    }

    private static int count;
    
    public Product(){
        count++;
        productID = count;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getCeilingPrice() {
        return ceilingPrice;
    }

    public void setCeilingPrice(float ceilingPrice) {
        this.ceilingPrice = ceilingPrice;
    }

    public float getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(float floorPrice) {
        this.floorPrice = floorPrice;
    }

    public float getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(float targetPrice) {
        this.targetPrice = targetPrice;
    }

   

      @Override
    public String toString() {
       // return "Product{" + "drugID=" + drugID + '}';
        return productName;
    }
    
      
    @Override
    public int compareTo(Product p) {
       if( this.productSellCount > p.getProductSellCount()){
           return -1;
       }else if (this.productSellCount < p.getProductSellCount()){
            return 1;
       }else{
           
        return 0;
    }
        
    }
   
}
