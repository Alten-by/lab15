/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab12;

/**
 *
 * @author Timofey
 */
public class Shape {
    private String name;
    private int id;
    private double area;

    public Shape(String name, int id, double area) {
        this.name = name;
        this.area = area;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "id=" + id + " name=" + name + " area=" + area + "sm2";
    }
}
