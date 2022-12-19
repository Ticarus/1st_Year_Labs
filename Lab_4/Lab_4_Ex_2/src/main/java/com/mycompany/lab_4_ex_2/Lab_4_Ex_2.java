/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_4_ex_2;

/**
 *
 * @author ereng
 */
public class Lab_4_Ex_2 {

    public static void main(String[] args) {
        int i,j,k;
        
        for(i=6;i>0;i--)
        {
            for(j=1;j<i;j++)
            {
                System.out.print("_");
            }
            for(k=6;k>i;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
