// reverse a number
import java.util.Scanner;

public class ReverseNum {

    static int reverseNum(int x) {
        int ans = 0;
        while (x > 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num >> ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Rever of num = " + reverseNum(n));
    }
}
