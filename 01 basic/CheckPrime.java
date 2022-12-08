import java.util.Scanner;

public class CheckPrime {
    public static boolean isPrime(int x){
        for(int i=2;i*i<x;i++){
            if(x % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. to check if it's prime >> ");       
        int n = sc.nextInt();
        if(isPrime(n))
            System.out.println(n + " is prime");
        else
            System.out.println(n + " is not prime");
    }
}
