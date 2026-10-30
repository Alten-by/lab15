/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab11;

/**
 *
 * @author Timofey
 */
public class Fish extends Animal {
    
    public Fish(String name, int age, double weight){
        super(name, age, weight);
    }
    
    @Override
    public void move() {
        System.out.println("Плавает");
    }
}
