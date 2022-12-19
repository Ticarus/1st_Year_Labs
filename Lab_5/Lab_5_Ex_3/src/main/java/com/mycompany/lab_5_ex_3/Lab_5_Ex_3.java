/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_5_ex_3;
import java.util.*;
/**
 *
 * @author ereng
 */
public class Lab_5_Ex_3 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        int x1,x2,y1,y2,distance;
        
        System.out.println("Input two x and two y values:");
        x1 = console.nextInt();
        x2 = console.nextInt();
        y1 = console.nextInt();
        y2 = console.nextInt();
        
        distance = dist(x1 , x2, y1, y2);
        
        System.out.println("Distance between two points is " + distance);
    }
    
    public static int dist(int x1, int x2, int y1, int y2){
        int x,y,t,d;
        
        x = x2 - x1;
        y = y2 - y1;
        
        t = (int) (Math.pow(x, 2) + Math.pow(y, 2));
        d = (int) Math.sqrt(t);
        
        return d;
    }
}
