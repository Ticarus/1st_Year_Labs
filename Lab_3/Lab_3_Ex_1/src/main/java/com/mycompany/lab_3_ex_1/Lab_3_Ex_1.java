/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_3_ex_1;

/**
 *
 * @author ereng
 */
public class Lab_3_Ex_1 {

    public static void main(String[] args) {
        printNumbers(15);
        printNumbers(5);
    }
    
    public static void printNumbers(int n){
        for(int i=1;i<=n;i++)
        {
            System.out.print(" [" + i + "] ");
        }
        System.out.println("");
    }
}
