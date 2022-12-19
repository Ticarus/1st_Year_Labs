/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_4_ex_6;

/**
 *
 * @author ereng
 */
public class Lab_4_Ex_6 {

    public static void main(String[] args) {
        int i,j;
        
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=4-i;j++)
            {
                System.out.print("_");
            }
            for(j=1;j<=(2*i)-1;j++)
            {
                System.out.print(i);
            }
            for(j=1;j<=4-i;j++)
            {
                System.out.print("_");
            }
            System.out.println();
        }
    }
}
