/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week11tpfactory;

/**
 *
 * @author JiJi
 */
public class PlanFactory {
    
    public Plan getPlan(String typePlan){
    
        switch(typePlan){
        
            case "domestique" : return new PlanDomestique();
            case "commercial" : return new PlanCommercial();
            case "intitutionnel" : return new PlanInstitutionnel();
            case "ong" : return new PlanONG();
            
            default:return null;
        }
    }
    
}
