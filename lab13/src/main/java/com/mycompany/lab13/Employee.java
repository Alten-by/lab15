/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab13;

import java.util.List;

/**
 *
 * @author Timofey
 */
public class Employee {
    private String name;
    private String position;
    private double salary;
    private String department;
    
    public Employee(String name, String position, double salary, String department){
        setName(name);
        setPosition(position);
        setSalary(salary);
        setDepartment(department);
    }
    
    public void setName(String name){
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Имя не может быть пустым");
        else
            this.name=name;
    }
    
    public void setPosition(String position){
        if (position == null || position.isBlank())
            throw new PromotionException("Название позиции не может быть пустым");
        else
            this.position=position;
    }
    
    public void setSalary(double salary){
        if (salary<=0)
            throw new InvalidSalaryException("Зарплата должна быть больше нуля");
        else
            this.salary=salary;
    }
    
    public void setDepartment(String department){
        List<String> list = List.of("Продажи", "Разработка", "Бухгалтерия");

        if (department == null || department.isBlank())
            throw new IllegalArgumentException("Название отдела не может быть пустым");
        else if(!(list.contains(department)))
            throw new DepartmentNotFoundException("Нету такого отдела");
        else
            this.department=department;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPosition(){
        return position;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public String getDepartment(){
        return department;
    }
    public void promote(String newPosition){
        setPosition(newPosition);
    }
    public void changeDepartment(String newDept){
        setDepartment(newDept);
    }
    
    @Override
    public String toString(){
        return "Сотрудник: "+name+" Отдел: "+department+" Позиция: "+position+" Зарплата: "+salary;
    }
}