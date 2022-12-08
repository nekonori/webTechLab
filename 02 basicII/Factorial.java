// find factorial of a num
import java.util.Scanner;

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
        sc.close();
        System.out.println(n + "! = " + fact(n));
    }
}
