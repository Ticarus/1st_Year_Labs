/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_6_ex_2;
import java.util.*;
/**
 *
 * @author ereng
 */
public class Lab_6_Ex_2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number;
        System.out.print("Please enter a number: ");
        number = console.nextInt();
        number = Math.abs(number);
        
        int numbertemp = number;
        
        int digit;
        int even_ctr = 0;
        int odd_ctr = 0;
        int zero_ctr = 0;
        
        
        while(numbertemp>0)
        {
            digit = numbertemp % 10;
            
            if(digit % 2 == 0)
            {
                even_ctr++;
            }
            else
            {
                odd_ctr++;
            }
            
            if(digit == 0)
            {
                zero_ctr++;
            }
           
            numbertemp = numbertemp / 10;
        }
        
        System.out.println("Even digit count = " + even_ctr);
        System.out.println("Odd digit count = " + odd_ctr);
        System.out.println("Zero count = " + zero_ctr);
    }
}
