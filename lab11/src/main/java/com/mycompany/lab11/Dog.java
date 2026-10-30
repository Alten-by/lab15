/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab11;

/**
 *
 * @author Timofey
 */
public class Dog extends Animal {
    
    public Dog(String name, int age, double weight){
        super(name, age, weight);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Гав-гав");
    }

    @Override
    public void move() {
        System.out.println("Бегает");
    }
}
