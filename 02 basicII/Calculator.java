
// implement a basic calc
import java.util.Scanner;

public class Calculator {
    static void pln(Object o) {
        System.out.println(o);
    }

    static void print(Object o) {
        System.out.print(o);
    }

    static void printMenu() {
        pln("1 -> Add\n2 -> Sub\n3 -> Mul\n4 -> Div\n-1 -> exit");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int choice = 0;
            while (choice != -1) {
                printMenu();
                System.out.print(">>");
                choice = sc.nextInt();
                if (choice == -1)
                    return;
                print("A: ");
                int a = sc.nextInt();
                print("B: ");
                int b = sc.nextInt();
                if (choice == 1)
                    pln("A + B = " + (a + b));
                else if (choice == 2)
                    pln("A - B = " + (a - b));
                else if (choice == 3)
                    pln("A * B = " + (a * b));
                else if (choice == 4)
                    pln("A / B = " + (a / b));
            }
        } finally {
            sc.close();
        }
    }
}
