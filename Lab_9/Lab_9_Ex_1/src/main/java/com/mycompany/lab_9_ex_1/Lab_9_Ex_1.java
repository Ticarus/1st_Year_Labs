/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_9_ex_1;

/**
 *
 * @author ereng
 */
public class Lab_9_Ex_1 {

    public static void main(String[] args) {
        int [] array = {1,3,4,5,6,7,9,10};
        
        boolean result = isUnique(array);
        
        System.out.println(result);
    }
    
    public static boolean isUnique(int[] array)
    {
        int value;
        
        for(int i = 0 ; i < array.length ; i++)
        {
            value = array[i];
            
            for(int j = i + 1 ; j < array.length ; j++)
            {
                if(value == array[j])
                    return false;
            }
        }
        return true;
    }
}
