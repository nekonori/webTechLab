import java.util.*;

public class Numbers {
    static void log(Object o){
        System.out.println(o);
    }
   public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>(Arrays.asList(34, 11, 12, 56, 78, 445, 67, 19));
    log("Array elements: " + Arrays.asList(arr.toArray()));
    log("Avg of arr: " + arr.stream().mapToDouble(a -> a).average().getAsDouble());
    log("Max val: " + Collections.max(arr));
    log("Min val: " + Collections.min(arr));
    arr.removeIf(e -> e % 2 == 1);
    log("Even nos: " + Arrays.asList(arr.toArray()));
   } 
}
