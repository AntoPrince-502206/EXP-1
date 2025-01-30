/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sxcce.mavenproject1;

/**
 *
 * @author IT20
 */

    


import java.util.*;
public class Mavenproject1 
{
    public static void main(String[] args) 
    {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = a.nextInt();       
        System.out.print("Enter the second number: ");
        int num2 = a.nextInt();      
        int sum = num1 + num2;       
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);        
        a.close();
    }
}
