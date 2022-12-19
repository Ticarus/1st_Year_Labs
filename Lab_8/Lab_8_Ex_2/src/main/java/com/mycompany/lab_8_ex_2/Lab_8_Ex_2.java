/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_8_ex_2;
import java.util.*;
/**
 *
 * @author ereng
 */
public class Lab_8_Ex_2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Input a word: ");
        
        String s = console.nextLine();
        
        System.out.println(stutter(s));
    }
    
    public static String stutter(String s){
        String result = "";
        
        for(int i = 0 ; i < s.length() ; i++)
        {
            result += s.charAt(i);
            result += s.charAt(i);
        }
        return result;
    }
}
