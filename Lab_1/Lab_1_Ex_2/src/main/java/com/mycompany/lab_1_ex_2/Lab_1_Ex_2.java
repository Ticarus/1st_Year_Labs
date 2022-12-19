/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_1_ex_2;

/**
 *
 * @author ereng
 */
public class Lab_1_Ex_2 {

    public static void main(String[] args) {
        print_Victory_pack_1();
        print_Victory_pack_2();
        print_Victory_pack_2();
        print_Victory_pack_2();
        print_Victory_pack_2();
    }
    public static void print_backslashes(){
        System.out.println("//////////////////////");
    }
    public static void print_slashes(){
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }
    public static void print_Victory(){
        System.out.println("|| Victory is mine! ||");
    }
    public static void print_Victory_pack_1(){
        print_backslashes();
        print_Victory();
        print_slashes();
    }
    public static void print_Victory_pack_2(){
        print_Victory();
        print_slashes();
    }
}
