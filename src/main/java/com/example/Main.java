package com.example;

public class Main {
    public static void main(String[] args) 
    {
        Product prod1 = new Product();
                prod1.setId("P100");
                prod1.setName("Laptop");
                prod1.setPrice(1200.0);
                prod1.setStock(50);
        
                
                Product prod2 = new Product("P200", "Smartphone", 800.0, 30);
        
                
                prod2.setPrice(750.0);
                prod2.setStock(25);
        
                
                System.out.println("Producto 1 nombre: " + prod1.getName());
                System.out.println("Producto 2 precio: " + prod2.getPrice());
        
                
                System.out.println(prod1);
                System.out.println(prod2);
    }
}