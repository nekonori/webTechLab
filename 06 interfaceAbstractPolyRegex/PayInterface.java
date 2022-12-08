interface Payable {
    double getPaymentAmount();
}

abstract class Employee implements Payable {
    String firstName, lastName, ssn;

    public abstract double getPaymentAmount();
}

class Invoice implements Payable {
    String partNo, partDescription;
    int quantity;
    double pricePerItem;

    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }
}

abstract class CommissionEmployee extends Employee {
    double grossSales, commissionRate;

    public abstract double getPaymentAmount();
}

class BasePlusCommissionEmployee extends CommissionEmployee {
    double baseSalary;

    BasePlusCommissionEmployee(double bs, double comRate) {
        baseSalary = bs;
        super.commissionRate = comRate;
    }

    public double getPaymentAmount() {
        return baseSalary + super.commissionRate;
    }
}

class HourlyEmployee extends Employee {
    double wage, hours;

    public double getPaymentAmount() {
        return hours * wage;
    }

    HourlyEmployee(double wg, double hrs) {
        wage = wg;
        hours = hrs;
    }
}

class SalariedEmployee extends Employee {
    double weeklySalary;

    SalariedEmployee(double ws) {
        weeklySalary = ws;
    }

    public double getPaymentAmount() {
        return weeklySalary;
    }
}

public class PayInterface {
    static void log(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        log("Payment amount for commission emp: " + new BasePlusCommissionEmployee(10_000, 500).getPaymentAmount());
        log("for hourly emp: " + new HourlyEmployee(20_000, 6).getPaymentAmount());
        log("for salaried emp: " + new SalariedEmployee(20_000).getPaymentAmount());
    }
}