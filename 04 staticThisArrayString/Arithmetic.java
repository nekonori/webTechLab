import java.util.*;
public class Arithmetic {
    static int x, y;
    static void log(Object o){
        System.out.println(o);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        log("Enter x");
        x = sc.nextInt();
        log("Enter y");
        y = sc.nextInt();
        log("x + y = " + (x+y));
        log("x - y = " + (x-y));
        log("x * y = " + (x*y));
        log("x / y = " + (x/y));
        log("x % y = " + (x%y));
    }
}
