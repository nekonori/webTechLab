// program to calc area of square and rectangle

import java.util.Scanner;

public class Area {
     public static void main(String[] args){        
        Scanner sc = new Scanner(System.in);
        System.out.print("Side of square >> ");
        int n = sc.nextInt();
        System.out.println("Area of square: " + (n*n));
        System.out.print("Length of rectangle >> ");
        int l = sc.nextInt();
        System.out.print("Breadth of rectangle >> ");
        int b = sc.nextInt();
        sc.close();
        System.out.println("Area of rect: " + (l*b));
    }
}
