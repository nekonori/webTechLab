public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student s1 = new Student("John", 12);
        System.out.println("Student details");
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }
}
