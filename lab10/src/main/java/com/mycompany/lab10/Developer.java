/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab10;

/**
 *
 * @author Timofey
 */
public class Developer extends Worker {
    String language;
    public Developer(String name, double salary, String position, String language){
        this.language=language;
        super(name, salary, position);
    }

    @Override
    public void work() {
        System.out.println(name+" ("+position+") пишет на языке: "+language);
    }

    @Override
    public void promote() {
        switch (position) {
            case "Junior":
                position = "Middle";
                salary *= 1.5;
                break;
            case "Middle":
                position = "Senior";
                salary *= 1.7;
                break;
            case "Senior":
                position = "Team Lead";
                salary *= 1.3;
                break;
            default:
                System.out.println(name + " уже на максимальной должности: " + position);
        }
    }
    public String getLanguage() {
        return language;
    }
}
