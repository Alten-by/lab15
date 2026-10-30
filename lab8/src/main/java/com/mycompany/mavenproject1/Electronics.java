/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Timofey
 */
public class Electronics extends Product {
    private int warranty;
    
    public Electronics(String name, double price, double weight, int warranty) {
        super(name, price, weight);
        this.warranty = warranty;
    }
    
    public int getWarranty() {
        return warranty;
    }
    
    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
    
    @Override
    public String getDiscount() {
        return "Скидка 5%";
    }
    
    public String checkWarranty() {
        if (warranty > 0) {
            return "Гарантия действует: " + warranty + " мес.";
        } else {
            return "Гарантия истекла";
        }
    }
    
    @Override
    public String displayInfo() {
        return super.displayInfo() + " гарантия: " + warranty + " мес.";
    }
}
