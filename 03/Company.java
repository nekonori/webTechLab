
import java.util.*;

class Employee {

    String name, doj;
    double salary;

    Employee(String n, String d, double s) {
        name = n;
        doj = d;
        salary = s;
    }
}

public class Company {

    static int rand(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        for (int i = 0; i < 10; i++) {
            employees[i] = new Employee("emp" + i, rand(1, 30) + "-" + rand(1, 12) + "-" + rand(1900, 2022), rand(50000, 500000));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + "\n----");
            System.out.print("Name: " + employees[i].name);
            System.out.print(", Date of joining: " + employees[i].doj);
            System.out.print(", Salary: " + employees[i].salary + "\n\n");
        }
    }
}
