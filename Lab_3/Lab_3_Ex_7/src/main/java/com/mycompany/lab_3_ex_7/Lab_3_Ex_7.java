/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_3_ex_7;

/**
 *
 * @author ereng
 */
public class Lab_3_Ex_7 {

    public static void main(String[] args) {
        printSquare(3, 7);
        printSquare(2, 6);
        printSquare(0, 9);
    }
    
    public static void printSquare(int a, int b){
        int noCols=b-a+1;
        int val;
        
        for(int i=a;i<=b;i++)
        {
            val=i;
                    for(int j=1;j<=noCols;j++)
                    {
                        System.out.print(val + "");
                        
                        if(val==b)
                        {
                            val=a;
                        }
                        else
                        {
                            val++;
                        }
                    }
                    System.out.println();
        }
        
    }
}
