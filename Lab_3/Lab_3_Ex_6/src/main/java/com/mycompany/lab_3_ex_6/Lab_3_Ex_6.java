/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_3_ex_6;

/**
 *
 * @author ereng
 */
public class Lab_3_Ex_6 {

    public static void main(String[] args) {
        quadratic(1, 2, 4);
    }
    
    public static void quadratic(int a, int b, int c){
        double root1, root2;
        
        root1=-b-(Math.sqrt(b*b)-4*a*c)/2*a;
        
        root2=-b+(Math.sqrt(b*b)-4*a*c)/2*a;
        
        System.out.print(" " + root1 + "   " + root2 + " ");
    }
}
