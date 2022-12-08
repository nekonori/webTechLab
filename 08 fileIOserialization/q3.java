import java.io.*;

public class q3 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("inputfile.txt");
            FileWriter fw = new FileWriter("outputfile2.txt");
            int i = fr.read();
            String s = "";
            while (i != -1) {
                s += (char) i;
                i = fr.read();
            }
            fr.close();
            fw.write(s.toUpperCase());
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}