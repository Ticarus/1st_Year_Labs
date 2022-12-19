/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_5_ex_4;
import java.util.*;
/**
 *
 * @author ereng
 */
public class Lab_5_Ex_4 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        double salperh,hours,salary;
        System.out.println("Input the salary per hour and worked hours:");
        salperh = console.nextDouble();
        hours = console.nextDouble();
        
        
        salary = pay(salperh, hours);
        System.out.println("Salary:" + salary);
    }
    
    public static double pay(double salperh, double hours){
        double sal;
        
        if(hours<=8)
        {
            sal = (salperh * hours);
        }
        else
        {
            sal = ((salperh * 8) + ((salperh * 3/2) * ((int)hours - 8)));
        }
        
        return sal;
    }
}
