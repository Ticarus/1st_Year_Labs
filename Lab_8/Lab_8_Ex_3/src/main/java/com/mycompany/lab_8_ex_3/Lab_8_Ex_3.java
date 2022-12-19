/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_8_ex_3;
import java.util.*;
/**
 *
 * @author ereng
 */
public class Lab_8_Ex_3 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Input sentence:");
        
        String s = console.nextLine();
        
        System.out.println(wordCount(s));
    }
    
    public static int wordCount(String s){
        int count = 0;
        
        if(s.charAt(0) != ' ')
        {
            count++;
        }
        for(int i = 0 ; i < s.length() - 1 ; i++)
        {
            if(s.charAt(i) == ' ' && s.charAt(i + 1) != ' ')
            {
                count++;
            }
        }
        return count;
    }
}
