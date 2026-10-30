/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab13;

/**
 *
 * @author Timofey
 */
public class DepartmentNotFoundException extends RuntimeException{
    public DepartmentNotFoundException(String message){
        super(message);
    }
}
