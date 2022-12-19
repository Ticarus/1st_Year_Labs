/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_9_ex_4;
import java.util.Arrays;

/**
 *
 * @author ereng
 */
public class Lab_9_Ex_4 {

    public static void main(String[] args) {
        int[] a1 = {1,3,4,5,6,7,8,9};
        int[] a2 = {2,3,4};
        
        System.out.println(Arrays.toString(append(a1,a2)));
    }
    
    public static int[] append(int[] a1, int[] a2)
    {
        int[] a3 = new int[a1.length + a2.length];
        
        for(int i = 0 ; i < a1.length ; i++)
        {
            a3[i] = a1[i];
        }
        
        for(int i = 0 ; i < a2.length ; i++)
        {
            a3[a1.length + i] = a2[i];
        }
        return a3;
    }
}
