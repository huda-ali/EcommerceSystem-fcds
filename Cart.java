/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author Mega Store
 */
public class Cart {
    private int customerId;
    private int nProducts;
    private final Product[] products;

    
    public Cart(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId);
        this.nProducts = Math.abs(nProducts);
        this.products = new Product[this.nProducts];
    }

    
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getNProducts() {
        return nProducts;
    }

    public void setNProducts(int nProducts) {
       if(nProducts<0) this.nProducts = Math.abs(nProducts);
       else  this.nProducts=nProducts;
    }

    public Product[] getProducts() {
        return products;
    }
    public void addProduct(Product product, int index) {
        if (index >= 0 && index < nProducts) {
            products[index] = product;
        } else {
            System.out.println("Invalid index");
        }
    }

    
    public void removeProduct(int index) {
        if (index >= 0 && index < nProducts) {
            products[index] = null;
        } else {
            System.out.println("Invalid index");
        }
    }

    
    public double calculatePrice() {
        double totalPrice = 0.0;
        for (Product product : products) {
            if (product != null) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }

    
    public void placeOrder() {
        
        System.out.println("Order placed successfully!");
    }
}
