
// check if a<100 && a>b
import java.util.*;

public class TwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.println(a < 100 && a > b ? "True" : "False");
        sc.close();
    }
}
