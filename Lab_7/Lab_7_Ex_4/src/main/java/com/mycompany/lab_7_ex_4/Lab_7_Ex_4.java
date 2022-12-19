/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_7_ex_4;
import java.util.*;
/**
 *
 * @author ereng
 */
public class Lab_7_Ex_4 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        evenSumMax(console);
    }
    
    public static void evenSumMax(Scanner console)
    {
        int num,n;
        int even_sum = 0;
        int max_even = 0;
        
        
        System.out.print("How many integers? ");
        n = console.nextInt();
        
        for(int i = 1 ; i <= n ; i++)
        {
            System.out.print("Integer#" + i + ": ");
            num = console.nextInt();
            if(num % 2 == 0)
            {
                even_sum = even_sum + num;
                if(num > max_even)
                {
                    max_even = num;
                }
            }
        }
        System.out.println("Sum of even numbers: " + even_sum);
        System.out.println("Max even: " + max_even);
    }
}
