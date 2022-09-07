/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week11tpfactory;

import java.util.Scanner;

/**
 *
 * @author JiJi
 */
public class Week11TpFactory {

    public static void main(String[] args) {
        
        
        PlanFactory planFactory = new PlanFactory();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quel est votre plan");
        
        String plan = scan.nextLine();
        
        System.out.println("Le nombre d'unites");
        
        int unite = scan.nextInt();
        
        Plan p = planFactory.getPlan(plan);
        
        p.setTaux();
        
        p.calculerFacture(unite);
        
    }
}
