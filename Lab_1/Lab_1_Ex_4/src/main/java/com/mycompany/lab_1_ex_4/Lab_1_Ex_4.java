/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_1_ex_4;

/**
 *
 * @author ereng
 */
public class Lab_1_Ex_4 {

    public static void main(String[] args) {
        top();
        bot();
        System.out.println();
        mid();
        System.out.println();
        top();
        bot();
    }
    public static void top(){
        System.out.println("  _______  ");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }
    public static void bot(){
        System.out.println("\\         /");
        System.out.println(" \\       /");
        System.out.println("  ¯¯¯¯¯¯¯");
    }
    public static void mid(){
        System.out.println("-\"-'-\"-'-\"-");
    }
}
