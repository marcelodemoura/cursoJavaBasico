package com.cursojava.cursoNelioAlves.basico.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;



    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;

    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public double total(){
        return this.quantity * price;
    }


    public String toString() {
        return (name + ", $ " + String.format("%.2f", price) + ", " + quantity + " unidades, Total: $" +String.format("%.2f", totalValueInStock()));
    }


}
