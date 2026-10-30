/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Timofey
 */
public class Food extends Product {
    private int expirationDate;
    
    public Food(String name, double price, double weight, int expirationDate) {
        super(name, price, weight);
        this.expirationDate = expirationDate;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String getDiscount() {
        return "Скидка 15%";
    }

    public boolean isExpired() {
        return expirationDate<=0;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + " срок годности: " + expirationDate+" мес.";
    }
}
