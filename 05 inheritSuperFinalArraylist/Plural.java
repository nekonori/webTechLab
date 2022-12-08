import java.util.*;

public class Plural {
    static void log(Object o) {
        System.out.println(o);
    }

    static void capitalizePlurals(List<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).endsWith("s"))
                arr.set(i, arr.get(i).toUpperCase());
        }
    }

    static void removePlurals(List<String> arr) {
        int i = 0;
        while (i < arr.size()) {
            if (arr.get(i).endsWith("s") || arr.get(i).endsWith("S")) {
                arr.remove(i);
            } else
                i++;
        }
    }

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>(Arrays.asList("Hello", "world", "cats", "dogs"));
        log(Arrays.toString(arr.toArray()));
        Collections.reverse(arr);
        log(Arrays.toString(arr.toArray()));
        capitalizePlurals(arr);
        log(Arrays.toString(arr.toArray()));
        removePlurals(arr);
        log(Arrays.toString(arr.toArray()));
    }
}
