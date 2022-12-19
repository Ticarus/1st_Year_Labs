/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_1_ex_5;

/**
 *
 * @author ereng
 */
public class Lab_1_Ex_5 {

    public static void main(String[] args) {
        stage_3();
    }
    public static void sentence(){
        System.out.println("All work and no play makes Jack a dull boy.");
    }
    public static void stage_1(){  //prints sentence 10 times
        sentence();
        sentence();
        sentence();
        sentence();
        sentence();
        sentence();
        sentence();
        sentence();
        sentence();
        sentence();
    }
    public static void stage_2(){    //10 x 10 = 100
        stage_1();
        stage_1();
        stage_1();
        stage_1();
        stage_1();
        stage_1();
        stage_1();
        stage_1();
        stage_1();
        stage_1();
    }    
    public static void stage_3(){    //100 x 10 = 1000
        stage_2();
        stage_2();
        stage_2();
        stage_2();
        stage_2();
        stage_2();
        stage_2();
        stage_2();
        stage_2();
        stage_2();
    }
}
