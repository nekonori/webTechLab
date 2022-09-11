import java.util.Arrays;

public class Student {
    static void log(Object o){
        System.out.println(o);
    }
    public static void main(String[] args) {
        int[] marks = {98, 56, 88, 91, 73, 90, 87, 100, 66, 50};
        log("Array before and after sort");
        log(Arrays.toString(marks));
        Arrays.sort(marks);
        log(Arrays.toString(marks));
        log("Searching for 88: " + Arrays.binarySearch(marks, 88));
        int[] tmp = {1,2,3};
        log("Is marks equal to [1,2,3]: " + Arrays.equals(marks, tmp));
        Arrays.fill(marks, 100);
        log("After fill with 100: " + Arrays.toString(marks));
    }
}
