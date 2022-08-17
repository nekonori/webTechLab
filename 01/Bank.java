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
public class Bank {
    static int balance = 0;
    static void credit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount >> ");
        int amt = sc.nextInt();
        balance += amt;
    }
    static void debit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount >> ");
        int amt = sc.nextInt();
        balance -= amt;
    }
    static void disp(){
        System.out.println("Account balance: " + balance);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("1-Credit, 2->Debit \n3->Display, -1->Exit\n");
        int choice = 0;
        while(choice != -1){
            System.out.print(">>");
            choice = sc.nextInt();
            switch (choice){
                case 1 -> credit();
                case 2 -> debit();
                case 3 -> disp();
            }
        }        
    }
}
