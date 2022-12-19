/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_7_ex_3;
import java.util.*;
/**
 *
 * @author ereng
 */
public class Lab_7_Ex_3 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        longestName(console, 4);
    }
    
    public static void longestName(Scanner console, int n)
    {
        String name;
        String longest = "";
        for(int i = 1 ; i <= n ; i++)
        {
            System.out.print("name#" + i + ": ");
            name = console.next();
            if(name.length() > longest.length())
            {
                longest = name;
            }
        }
        System.out.println(longest + " name is longest");
    }
}
