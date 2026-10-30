/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab11;

/**
 *
 * @author Timofey
 */
public class Lab11 {

    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
            new Fish("Немо", 2, 0.3),
            new Animal("Вомбат", 5, 20.0),
            new Dog("Бобик", 4, 12.5)  
        };
        
        String[] sounds = new String[]{
            "булькающий",
            "хриплый",
            "скулящий"
        };
        
        for(int i=0;i<animals.length;i++){
            System.out.println(animals[i].getName());
            animals[i].makeSound();
            animals[i].makeSound(i+1);
            animals[i].makeSound(sounds[i]);
        }
    }
}
