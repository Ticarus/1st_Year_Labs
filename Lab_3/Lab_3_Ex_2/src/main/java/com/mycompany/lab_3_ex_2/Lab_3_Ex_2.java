/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_3_ex_2;

/**
 *
 * @author ereng
 */
public class Lab_3_Ex_2 {

    public static void main(String[] args) {
        printPowersOf2(3);
        printPowersOf2(10);
    }
    
    public static void printPowersOf2(int power){
        
        int result = 1;
        
        while(power != 0)
        {
            result *= 2;
            
            power--;
            
            System.out.print(" " + result + " ");
        }
        System.out.println("");
    }
}
