package org.skypro.skyshop.product;
public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String toString() {
        return name + ": " + cost;
    }
}


