import java.util.stream.IntStream;

abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    int[] marks;

    A(int[] m) {
        marks = m;
    }

    double getPercentage() {
        return IntStream.of(marks).sum() / 3;
    }
}

class B extends Marks {
    int[] marks;

    B(int[] m) {
        marks = m;
    }

    double getPercentage() {
        return IntStream.of(marks).sum() / 4;
    }
}

public class Students {
    public static void main(String[] args) {
        System.out.println("Student A: " + new A(new int[] { 89, 95, 76 }).getPercentage());
        System.out.println("Student B: " + new B(new int[] { 77, 89, 95, 76 }).getPercentage());
    }
}
