/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

/**
 *
 * @author Neha Ghate
 */
public class ProductCatalog {
    
private ArrayList<Product> productList;


    public ProductCatalog(){
    this.productList = new ArrayList<Product>();
}
    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public Product addProduct(Product product) {
       // Product d = new Product();
        productList.add(product);
        return product;
        
    }
    public void removeProduct(Product product)
    {
        productList.remove(product);
    }
    
     public Product getPopularProduct(){
        
        Collections.sort(productList);
        
        Product popularProduct = productList.get(0);
        
        return popularProduct;
    
   }

    
     
}
