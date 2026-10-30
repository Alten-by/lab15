/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab10;

/**
 *
 * @author Timofey
 */
public class Manager extends Worker {
    int teamSize;
    public Manager(String name, double salary, String position, int teamSize){
        this.teamSize=teamSize;
        super(name, salary, position);
    }

    @Override
    public void work() {
        System.out.println(name+" ("+position+") управляет командой из "+teamSize+" человек");
    }

    @Override
    public void promote(){
        if("Менеджер".equals(position)){
            teamSize*=2;
            salary*=1.4;
            position="Старший менеджер";
        }
        else
            System.out.println("Нельзя повысить");
    }
    public int getTeamSize() {
        return teamSize;
    }
}
