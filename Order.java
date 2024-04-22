/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author Mega Store
 */
public class Order {
    private final int customerId;
    private final int orderId;
    private final Product[] products;
    private final float totalPrice;

    
    public Order(int customerId, int orderId, Product[] products, float totalPrice) {
        this.customerId = Math.abs(customerId); 
        this.orderId = Math.abs(orderId); 
        this.products = products;
        this.totalPrice = Math.abs(totalPrice); 
    }

    
    public void printOrderInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + ": $" + product.getPrice());
        }
        System.out.println("Total Price: $" + totalPrice);
    }
    
}
