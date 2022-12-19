/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_5_ex_1;
import java.util.*;
/**
 *
 * @author ereng
 */
public class Lab_5_Ex_1 {

    public static void main(String[] args) {
         lastDigit();
    }
    
    public static void lastDigit(){
        Scanner console = new Scanner(System.in);
        
        int num,last;
        System.out.println("Input an integer:");
        num = console.nextInt();
        
        last = num % 10;
       
        System.out.print("The last digit is " + last);
        
    }
}
