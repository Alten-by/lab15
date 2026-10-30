/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab12;

/**
 *
 * @author Timofey
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, int id, double area, double width, double height) {
        super(name, id, area);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + " width=" + width + " height=" + height;
    }
}
