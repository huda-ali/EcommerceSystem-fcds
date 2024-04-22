/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommercesystem;

import java.util.Scanner;
public class EcommerceSystem {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ElectronicProduct smartphone = new ElectronicProduct();
        smartphone.setName("smartphone");
        smartphone.setId(1);
        smartphone.setPrice(599.9f);
        smartphone.setBrand("Samsung");
        smartphone.setWarrantyPeriod(1);
        ClothingProduct tShirt = new ClothingProduct();
        tShirt.setName("T-shirt");
        tShirt.setId(2);
        tShirt.setPrice(19.99f);
        tShirt.setSize("Medium");
        tShirt.setFabric("Cotton");

        
        BookProduct oopBook = new BookProduct();
        oopBook.setName("OOP");
        oopBook.setId(3);
        oopBook.setPrice(39.99f);
        oopBook.setAuthor("O’Reilly");
        oopBook.setPublisher("X Publications");

        
        Customer customer = new Customer();
        System.out.print("Enter your customer ID: ");
        customer.setCustomerId(input.nextInt());
        System.out.print("Enter your name: ");
        customer.setName(input.next());
        System.out.print("Enter your address: ");
        customer.setAddress(input.next());

        
        System.out.print("How many products do you want to order? ");
        int numProducts = input.nextInt();
        Cart cart = new Cart(customer.getCustomerId(), numProducts);
        for (int i = 0; i < numProducts; i++) {
            System.out.println("which product would you like to add \n [1]smart phone \n [2] t_shirt \n [3]OOP");
            int type = input.nextInt();
            switch (type) {
                case 1 -> {
                    cart.addProduct(smartphone, i);
                }
                case 2 -> {  
                    cart.addProduct(tShirt, i);
                }
                case 3 -> {
                    cart.addProduct(oopBook, i);
                }
                default -> System.out.println("Invalid product type!");
            }
        }

        
        System.out.print("do you want to place an order? (yes/no): ");
        String answer = input.next();
        if (answer.equalsIgnoreCase("yes")) {
            cart.placeOrder();
        }

        
        System.out.println("Order Information:");
        Order order = new Order(customer.getCustomerId(), 1, cart.getProducts(), (float) cart.calculatePrice());
        order.printOrderInfo();

        
    }
        
    }
    

