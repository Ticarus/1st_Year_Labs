/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_9_ex_3;

import java.util.Arrays;

/**
 *
 * @author ereng
 */
public class Lab_9_Ex_3 {

    public static void main(String[] args) {
        int[] a2 = {2,3,4};
 
        System.out.println(Arrays.toString(collapse(a2)));
    }
    
    public static int[] collapse(int[] array)
    {
        int L = array.length;
        int outSize;
        
        if(L % 2 == 0)
        {
            outSize = L / 2;
        }
        else
        {
            outSize = L /2 + 1;
        }
        
        int[] array2 = new int[outSize];
        int i2 = 0;
        
        for(int i = 0 ; i < L - 1 ; i = i + 2)
        {
            array2[i2] = array[i] + array[i + 1];
            i2++;
        }
        
        if(L % 2 == 1)
        {
            array2[outSize - 1] = array[L - 1];
        }
        return array2;
    }
}
