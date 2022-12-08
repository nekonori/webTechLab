import java.util.Scanner;

public class StringHandling {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hello");
        System.out.println("String: " + s + "\nCapacity: " + s.capacity());
        s.reverse();
        System.out.println("After reverse: " + s + "\nLower case: " + s.toString().toLowerCase());
        System.out.println("Upper case: " + s.toString().toUpperCase());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a tring to append: ");
        String ns = sc.next();
        s.append(ns);
        System.out.println(s);
    }

}
