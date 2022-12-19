/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_9_ex_2;

/**
 *
 * @author ereng
 */
public class Lab_9_Ex_2 {

    public static void main(String[] args) {
        int[] a1 = {1,3,4,5,5,7,8,9};
        int[] a2 = {2,3,4};
        System.out.println(contains(a1, a2));
    }
    
    public static boolean contains(int[] a1, int[] a2)
    {
        int counter;
        for(int i = 0 ; i < (a1.length - a2.length) ; i++)
        {
            counter = 0;
          
            for(int j = 0 ; j < a2.length ; j++)
            {
                if(a1[i + j] == a2[j])
                {
                    counter++;
                }
                else
                {
                    break;
                }
    
                if(counter == a2.length)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
