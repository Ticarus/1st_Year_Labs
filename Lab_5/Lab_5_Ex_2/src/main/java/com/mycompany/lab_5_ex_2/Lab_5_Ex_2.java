/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_5_ex_2;
import java.util.*;
/**
 *
 * @author ereng
 */
public class Lab_5_Ex_2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        double radius,a;
        
        System.out.println("Input the radius:");
        radius = console.nextDouble();
        
        a = areaofcircle(radius);
        
        System.out.println("The area of circle with the radius of " + radius + " is " + a);
    }
    
    public static double areaofcircle(double radius){
        double area;
        
        area = (radius * radius) * Math.PI;
        
        return area;
    }
}
