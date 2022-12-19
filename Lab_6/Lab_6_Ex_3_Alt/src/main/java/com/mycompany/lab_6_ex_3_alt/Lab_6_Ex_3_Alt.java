/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_6_ex_3_alt;
import java.util.*;
/**
 *
 * @author ereng
 */
public class Lab_6_Ex_3_Alt {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int grade;
        int min = 100;
        int max = 0;
        double sum = 0;
        double avg = 0;
        int count = 0;
        
        System.out.print("Please enter student's grade (-1 to quit):");
        grade = console.nextInt();
        
        while(grade != -1)
        {
            sum = sum + grade;
            count++;
            
            if(grade < min)
            {
                min = grade;
            }
            
            if(grade > max)
            {
                max = grade;
            }
            
            System.out.print("Please enter student's grade (-1 to quit):");
            grade = console.nextInt();   
        }
        
        avg = sum / count;
        
        System.out.println("The average grade is " + avg);
        System.out.println("The minimum grade is " + min);
        System.out.println("The maximum grade is " + max);
    }
}
