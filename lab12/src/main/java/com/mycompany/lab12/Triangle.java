/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab12;

/**
 *
 * @author Timofey
 */
public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String name, int id, double area, double base, double height) {
        super(name, id, area);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + " base=" + base + " height=" + height;
    }
}
