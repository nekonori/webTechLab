/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author student
 */
public class SumOfNums {
    public static void main(String[] args){
        int ans = 0;
        for(int i=101;i<200;i++){
            if(i%3==0){
                ans += i;
                i += 2;
            }
        }
        System.out.println("Sum of no.s that are >100 && <200 && divisible by 3 = " + ans);
    }
}
