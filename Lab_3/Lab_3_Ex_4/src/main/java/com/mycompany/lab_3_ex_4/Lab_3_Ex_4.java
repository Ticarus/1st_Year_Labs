/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_3_ex_4;

/**
 *
 * @author ereng
 */
public class Lab_3_Ex_4 {

    public static void main(String[] args) {
        largerAbsValue(11, 2);
        largerAbsValue(4, -5);
        largerAbsValue(-6, 2);
        largerAbsValue(-12, -11);
        largerAbsValue(-9, -20);
    }
    
    public static void largerAbsValue(int a, int b){
        
        if(a<0)
        {
            a *= -1;
        }
        
        if(b<0)
        {
            b *= -1;
        }
        
        if(a >= 0 && b >= 0)
        {
            if(a >= b)
            {
                System.out.print(a);
            }
            else
            {
                System.out.print(b);
            }
        }
        System.out.println("");
        
    }
}
