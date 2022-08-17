/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Factorial {
    private static int fact(int x){
        if (x == 1)
            return 1;
        return x * fact(x-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. to calculate its factorial >> ");       
        int n = sc.nextInt();
        System.out.println(n + "! = " + fact(n));
    }
}
