class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}

public class Emi {
    public static void main(String[] args) {
        try {
            int loanAmt = 1_00_000, year = 3;
            double rate = 0.13;
            int balance = 500;
            double emi = (loanAmt * (1 + rate)) / (year * 12);
            if (balance < emi)
                throw new MyException("Insufficient balance");
        } catch (Exception e) {
            System.out.println("Custom exception thrown. Insufficient balance");
        }

    }
}
