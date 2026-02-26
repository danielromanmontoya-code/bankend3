package com.example;

public final class Product {
       // atributos de instancia
    private String id;
    private String name;
    private double price;
    private int stock;

    // constructor por defecto
    public Product() {
        this.id = null;
        this.name = null;
        this.price = 0.0;
        this.stock = 0;
    }

    // constructor parametrizado
    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        setPrice(price);
        setStock(stock);
    }

    // getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.err.println("El precio no puede ser negativo. Se mantiene el valor anterior.");
        } else {
            this.price = price;
        }
    }

    public void setStock(int stock) {
        if (stock < 0) {
            System.err.println("El stock no puede ser negativo. Se mantiene el valor anterior.");
        } else {
            this.stock = stock;
        }
    }

    // toString sobrescrito
    @Override
    public String toString() {
        return "Product [ID: " + id + ", Nombre: " + name + ", Precio: " + price + ", Stock: " + stock + "]";
    }

}
