/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_5_ex_5;
import java.util.*;
/**
 *
 * @author ereng
 */
public class Lab_5_Ex_5 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        double a,b,c;
        
        System.out.println("Input 3 sides of the triangle:");
        a = console.nextDouble();
        b = console.nextDouble();
        c = console.nextDouble();
       
        System.out.print("The area of the triangle is " + triangleArea(a,b,c));
    }
    
    public static double triangleArea(double a, double b, double c){
        double s;
        s = (a + b + c) / 2;
        
        double area;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        return area;
    }
}
