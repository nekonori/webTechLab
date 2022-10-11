import java.util.*;

interface Machine {
}

abstract class Print implements Machine {
    static Scanner sc = new Scanner(System.in);

    static void log(Object o) {
        System.out.print(o);
    }

    void foo() {
        log("called from print\n");
    }
}

class NotPaidFullAmountException extends Exception {
    public NotPaidFullAmountException(String e) {
        super(e);
    }
}

class NoSufficientChangeException extends Exception {
    public NoSufficientChangeException(String e) {
        super(e);
    }
}

class SoldOutException extends Exception {
    public SoldOutException(String e) {
        super(e);
    }
}

final class VendingMachine extends Print implements Machine {

    int balance;

    void foo() {
        log("called from vending machine class\n");
    }

    public void pay(int cost) throws NotPaidFullAmountException, NoSufficientChangeException {
        log("To pay: ₹" + cost);
        int paidMoney = 0, coin;

        log("\nEnter no. of ₹1 coins: ");
        paidMoney += sc.nextInt();

        log("Enter no. of ₹5 coins: ");
        coin = sc.nextInt();
        if (coin > 0) paidMoney += 5 * coin;

        log("Enter no. of ₹10 coins: ");
        coin = sc.nextInt();
        if (coin > 0) paidMoney += 10 * coin;

        log("Enter no. of ₹25 coins: ");
        coin = sc.nextInt();
        if (coin > 0) paidMoney += 25 * coin;

        log("Enter no. of ₹50 coins: ");
        coin = sc.nextInt();
        if (coin > 0) paidMoney += 50 * coin;

        if (paidMoney < cost) {
            throw new NotPaidFullAmountException("Insufficient amount");
        }
        int toPayback = paidMoney - cost;
        if (toPayback > balance) {
            throw new NoSufficientChangeException("No change available");
        }
        log("Enter -1 to cancel request and get refund, 0 to continue >>");
        if (sc.nextInt() != -1) {
            log("Transaction successful, Take change of ₹" + toPayback);
            this.balance += cost;
        } else {
            log("Cancelled, take refund of ₹" + paidMoney);
        }
    }

    public void handleUser() {
        log("Available products:\n1.Chocolate - ₹10, 2.Snacks - ₹25, 3.Nuts - ₹50, 4.Juice - ₹20");
        log("\nEnter product number to select: ");
        int pno = sc.nextInt();

        try {
            switch (pno) {
                case 1 -> pay(10);
                case 2 -> pay(25);
                case 3 -> pay(50);
                case 4 -> pay(20);
            }
        } catch (Exception e) {
            log(e.getMessage());
        }
    }

    void resetMachine() {
        balance = 0;
    }
}

public abstract class Main extends Print {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.foo();
        log("Choices:\n1\t-> Buy products\n100\t->Reset machine\n-1\t->exit");
        while (true) {
            log("\n>>");
            int choice = sc.nextInt();
            if (choice == 1) vm.handleUser();
            else if (choice == 100) vm.resetMachine();
            else break;
        }
    }
}
