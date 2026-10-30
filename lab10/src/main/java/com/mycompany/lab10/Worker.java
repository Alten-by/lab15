/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab10;

/**
 *
 * @author Timofey
 */
abstract class Worker implements Workable, Promotable {
    protected String name;
    protected double salary;
    protected String position;

    public Worker(String name, double salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }
    
    public String getName() {
        return name;
    }
    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public abstract void work();

    @Override
    public abstract void promote();
}