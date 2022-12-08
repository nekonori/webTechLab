import java.util.*;

class BankAccount {
    int balance;
    static Scanner sc = new Scanner(System.in);

    static void log(Object o){
        System.out.print(o);
    }
    void credit(){
        log("Enter amount >> ");
        balance += sc.nextInt();
    }
    void debit(){
        log("Enter amount >> ");
        balance -= sc.nextInt();
    }
    void display(){
        log("Account balance: " + balance + "\n");
    }
    BankAccount(int balance){
        this.balance = balance;
    }
}

public class Bank{
    static void log(Object o){
        System.out.print(o);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        log("Enter initial balance: ");
        BankAccount act = new BankAccount(sc.nextInt());
        log("1-Credit, 2->Debit \n3->Display, -1->Exit\n");
        int choice = 0;
        while(choice != -1){
            log(">>");
            choice = sc.nextInt();
            switch (choice){
                case 1 -> act.credit();
                case 2 -> act.debit();
                case 3 -> act.display();
            }
        }
    }
}
