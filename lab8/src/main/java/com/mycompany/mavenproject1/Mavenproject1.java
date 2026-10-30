/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Timofey
 */
public class Mavenproject1 {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Electronics("Ноутбук", 75000, 2.5, 24);
        products[1] = new Electronics("Смартфон", 45000, 0.3, 12);
        products[2] = new Electronics("Наушники", 8000, 0.2, 6);
        products[3] = new Food("Молоко", 85, 1.0, 0);
        products[4] = new Food("Хлеб", 40, 0.5, 12);

        for (Product p : products) {
            System.out.println(p.displayInfo());
            System.out.println(p.getDiscount());
        }
        System.out.println();
        Electronics e = (Electronics) products[0];
        System.out.println(e.checkWarranty());
        Food f = (Food) products[3];
        System.out.println("просрочено: "+f.isExpired());
    }
}