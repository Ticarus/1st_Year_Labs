/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_7_ex_2;
import java.util.*;
/**
 *
 * @author ereng
 */
public class Lab_7_Ex_2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        smallestLargest(console);
    }
    
    public static void smallestLargest(Scanner console)
    {
        int noNumbers;
        System.out.println("How many numbers: ");
        noNumbers = console.nextInt();
        int number,smallest,largest;
        System.out.print("Number 1: ");
        number = console.nextInt();
        smallest = number;
        largest = number;
        for(int  i = 2 ; i <= noNumbers ; i++)
        {
            System.out.print("Number " + i + ": ");
            number = console.nextInt();
            if(number < smallest)
            {
                smallest = number;
            }
            if(number > largest)
            {
                largest = number;
            }
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
