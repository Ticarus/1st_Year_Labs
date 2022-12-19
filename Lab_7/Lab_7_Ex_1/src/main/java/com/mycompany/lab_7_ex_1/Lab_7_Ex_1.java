/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_7_ex_1;
import java.util.*;
/**
 *
 * @author ereng
 */
public class Lab_7_Ex_1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n1,n2;
        System.out.print("Enter the first number: ");
        n1 = console.nextInt();
        System.out.print("Enter the second number: ");
        n2 = console.nextInt();
        printRange(n1, n2);
    }
    
    public static void printRange(int n1, int n2)
    {   
        if(n1 < n2)
        {
            for(int i = n1 ; i <= n2 ; i++)
            {
                System.out.print(" " + i + " ");
            }
        }
        if(n1 > n2)
        {
            for(int i = n1 ; i >= n2 ; i--)
            {
                System.out.print(" " + i + " ");
            }
        }
        if(n1 == n2)
        {
            System.out.print(n1);
        }
    }
}
