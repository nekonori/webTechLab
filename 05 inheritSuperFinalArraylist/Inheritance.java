class Member{
    String name, phoneNo, address;
    int age, salary;
    public void printSalary(){
        System.out.println(salary);
    }
    Member(String n, String p, String a, int age, int s){
        name = n; phoneNo = p; address = a;
        this.age = age; salary = s;
    } 
    void printDetails(){
        System.out.println("Name: " + name + "\nAge: "+age+"\nPh: "+phoneNo);
        System.out.println("Address: "+address+"\nSalary: "+salary);
    }
}

class Employee extends Member{
    String specialization;
    Employee(String n, String p, String a, int age, int s, String specialization){
        super(n, p, a, age, s);
        this.specialization = specialization;
    }
    void printDetails(){
        super.printDetails();        
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Member{
    String department;
    Manager (String n, String p, String a, int age, int s, String dept){
        super(n, p, a, age, s);
        department = dept;
    }
    void printDetails(){
        super.printDetails();        
        System.out.println("Department: " + department);
    }
}
public class Inheritance {
    public static void main(String[] args){
        Employee e = new Employee("John", "123324", "Chennai", 44, 50000, "Web dev");
        Manager m = new Manager("Jim", "12321", "Delhi", 54, 70000, "IT");
        System.out.println("Emp details");e.printDetails();
        System.out.println("\nManager details");m.printDetails();
    }
}
