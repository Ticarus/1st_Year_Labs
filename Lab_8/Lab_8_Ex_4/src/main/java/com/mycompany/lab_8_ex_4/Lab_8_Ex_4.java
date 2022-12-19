/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_8_ex_4;
import java.util.*;
/**
 *
 * @author ereng
 */
public class Lab_8_Ex_4 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Input the max value you want to check for perfect numbers:");
        
        perfectNumbers(console.nextInt());
    }
    
    public static void perfectNumbers(int n){
        System.out.print("Perfect numbers up to " + n + ":");
        
        for(int current = 1 ; current <=n ; current++)
        {
            int sum = 0;
            
            for(int factor = 1 ; factor < current ; factor++)
            {
                if(current % factor == 0)
                {
                    sum += factor;
                }
            }
            
            if(sum == current)
            {
                System.out.print(" " + current);
            }
        }
    }
}
