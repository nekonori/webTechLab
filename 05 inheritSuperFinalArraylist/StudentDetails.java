
import java.util.*;

class Student {

    String name;
    int roll;

    Student(String n, int r) {
        name = n;
        roll = r;
    }
}

public class StudentDetails {

    static List<Student> students = new ArrayList<>();

    ;
    static void log(Object o) {
        System.out.println(o);
    }

    static void getStds(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).name + ", " + students.get(i).roll);
        }
    }

    public static void main(String[] args) {
        log("Adding students");
        for (int i = 0; i < 3; i++) {
            students.add(new Student("student" + (i+1), i + 1));
        }
        getStds(students);
        log("removing student3");
        students.remove(2);
        getStds(students);
        List<Student> tmp = new ArrayList<>();
        tmp.add(new Student("new student 1", 65));
        log("\nAdding another list");
        students.addAll(tmp);
        getStds(students);
        log("Removing another list");
        students.removeAll(tmp);
        getStds(students);
        log("Size: " + students.size());
        log("Contains student23 with roll 35: " + students.contains(new Student("student23", 35)));
    }
}
