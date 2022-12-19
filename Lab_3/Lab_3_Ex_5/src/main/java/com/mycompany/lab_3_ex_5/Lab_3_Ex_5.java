/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_3_ex_5;

/**
 *
 * @author ereng
 */
public class Lab_3_Ex_5 {

    public static void main(String[] args) {
        largestAbsVal(7, -2, -11);
        largestAbsVal(-4, 5, 2);
    }
    
    public static void largestAbsVal(int a, int b, int c){
        
        if(a<0)
        {
            a *= -1;
        }       
       
        if(b<0)
        {
            b *= -1;
        }        
       
        if(c<0)
        {
            c *= -1;
        }
        
        if(a>=0 && b>=0 && c>=0)
        {
           if(a>=b && a>=c)
            {
                System.out.print(a);
            }
           if(b>=a && b>=c)
            {
                System.out.print(b);
            }
           
           if(c>=a && c>=b)
           {
               System.out.print(c);
           }
           System.out.println("");
        }
    }
}
