/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_3_ex_8;

/**
 *
 * @author ereng
 */
public class Lab_3_Ex_8 {

    public static void main(String[] args) {
        printGrid(4, 6);
        printGrid(5, 3);
    }
    
    public static void printGrid(int rows, int columns){
        int result;
        
        for(int i=1;i<=rows;i++)
        {
            result = i;
            
            for(int j=1;j<=columns;j++)
            { 
                System.out.print(result + " ");
                
                result += rows;
            }
            if(result>=rows)
            {
                result = i;
            }
            
            System.out.println();
        }
    }
}
