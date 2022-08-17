package javaapplication1;

import java.util.Scanner;


public class PalindromeNumber {
    public static boolean isPalindrome(int x){
        String s = Integer.toString(x);
        int i = 0, j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++; j--;
        }        
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. to check if it's a palindrome >> ");       
        int n = sc.nextInt();
        if(isPalindrome(n))
            System.out.println(n + " is a palindrome");
        else
            System.out.println(n + " is not a palindrome");
    }
}
