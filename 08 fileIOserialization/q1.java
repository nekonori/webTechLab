import java.util.*;
import java.io.*;

public class q1 {
    public static void main(String[] args) throws IOException {
        var fis = new FileInputStream("inputfile.txt");
        var fos = new FileOutputStream("outputfile1.txt");
        var sb = new StringBuilder();
        int i;
        while ((i = fis.read()) != -1)
            if ((char) i == '\n')
                sb.append(' ');
            else if ((char) i != '\r')
                sb.append((char) i);
        fis.close();
        var arr = sb.toString().split(" ");
        Map<String, Integer> freq = new HashMap<>();
        for (String s : arr)
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        for (var word : new TreeSet<>(Arrays.asList(arr))) {
            String toWrite = freq.get(word) + " <- " + word + "\n";
            fos.write(toWrite.getBytes());
        }
        Arrays.sort(arr, (s1, s2) -> freq.get(s2) - freq.get(s1));
        int idx = 0;
        while (idx < arr.length) {
            if (freq.get(arr[idx]) > 0) {
                fos.write((arr[idx] + "\n").getBytes());
                freq.put(arr[idx], -1);
            }
            idx++;
        }
        fos.close();
    }
}
