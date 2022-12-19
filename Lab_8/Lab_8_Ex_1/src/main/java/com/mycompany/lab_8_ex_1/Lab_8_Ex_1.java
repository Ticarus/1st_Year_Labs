/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_8_ex_1;
import java.util.*;

/**
 *
 * @author ereng
 */
public class Lab_8_Ex_1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        printPalindrome(console);
    }
    
    public static void printPalindrome(Scanner console){
        System.out.print("Type one or more words: ");
        
        String input = console.nextLine();
        String lcInput = input.toLowerCase();
        
        int matches = 0;
        
        for(int i = 0 ; i < lcInput.length() / 2 ; i++)
        {
            if(lcInput.charAt(i) == lcInput.charAt(lcInput.length() - 1 - i))
            {
                matches++;
            }
        }
        if(matches == lcInput.length() / 2)
        {
            System.out.println(input + " is a palindrome!");
        }
        else
        {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
