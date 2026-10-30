/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab11;

/**
 *
 * @author Timofey
 */
public class Animal {
    protected String name;
    protected int age;
    protected double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void makeSound() {
        System.out.println("Издает звук");
    }

    public void makeSound(int volume) {
        System.out.println("Издает звук громкостью "+volume);
    }

    public void makeSound(String mood) {
        System.out.println("Издает "+mood+" звук");
    }

    public void move() {
        System.out.println("Животное двигается");
    }
    
    public String getName(){
        return name;
    }
}
