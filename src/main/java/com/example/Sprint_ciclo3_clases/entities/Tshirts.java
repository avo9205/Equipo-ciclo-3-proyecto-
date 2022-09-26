
package com.example.Sprint_ciclo3_clases.entities;

public class Tshirts {

    private String name;
    private String color;
    private String size;
    private double price;

    public Tshirts(String name, String color, String size, double price) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
