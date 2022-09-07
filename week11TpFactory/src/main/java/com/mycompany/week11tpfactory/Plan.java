/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week11tpfactory;

/**
 *
 * @author JiJi
 */
public abstract class Plan {
    
    protected double taux;
    
    abstract void setTaux();
    
    public void calculerFacture(int unite){
    
        System.out.print("Le taux est de : " + this.taux * unite + " euro");
    }
    
}
