/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author Mega Store
 */
public class Product {
   private int Id;
  private String name ;
   private float price ;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        if (Id<0){this.Id=Math.abs(Id);}
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price<0){this.price=Math.abs(price);}
        else  this.price = price;
}
}
