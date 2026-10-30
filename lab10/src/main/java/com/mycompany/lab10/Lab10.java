/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab10;

/**
 *
 * @author Timofey
 */
public class Lab10 {

    public static void main(String[] args) {
        Worker[] workers = {
            new Manager("Алексей Иванов", 3000, "Менеджер", 5),
            new Manager("Мария Петрова", 3500, "Старший менеджер", 8),
            new Developer("Иван Сидоров", 1500, "Junior", "Java"),
            new Developer("Елена Кузнецова", 2500, "Middle", "Python"),
            new Developer("Дмитрий Смирнов", 4000, "Senior", "C++")
        };
        for(Worker i : workers){
            System.out.println("До повышения");
            i.work();
            i.promote();
            System.out.println("После повышения");
            i.work();
            System.out.println();
        }
    }
}
