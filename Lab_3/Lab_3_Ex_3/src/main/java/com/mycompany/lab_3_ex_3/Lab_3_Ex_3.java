/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_3_ex_3;

/**
 *
 * @author ereng
 */
public class Lab_3_Ex_3 {

    public static void main(String[] args) {
        printPowersOfN(4, 3);
        printPowersOfN(5, 6);
        printPowersOfN(-2, 8);
    }
    
    public static void printPowersOfN(int base , int power){
       
        int result = 1;
        
        System.out.print(" [" + result + "] ");
       
        while(power != 0)
        {
            result *= base;
            
            power--;
            
            System.out.print(" [" + result + "] ");
        }
        System.out.println("");
    
 }
}