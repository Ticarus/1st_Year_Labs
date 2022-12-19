/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_6_ex_1;
import java.util.*;
/**
 *
 * @author ereng
 */
public class Lab_6_Ex_1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number;
        System.out.print("Please enter a number: ");
        number = console.nextInt();
        number = Math.abs(number);
        
        int numbertemp = number;
        
        int digit;
        int digit_sum = 0;
        
        
        while(numbertemp>0)
        {
            digit = numbertemp % 10;
            digit_sum = digit_sum + digit;
            numbertemp = numbertemp / 10;
        }
        
        System.out.println("The sum of digits = " + digit_sum);
    }
}
