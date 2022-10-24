import java.io.*;

class Country implements Serializable {
    String conName;
    String contName;
    transient int population;

    Country(String con, String cont, int pop) {
        conName = con;
        contName = cont;
        population = pop;
    }

    void print() {
        System.out.println(conName + " " + contName + " " + population);
    }
}

public class q2 {
    public static void main(String[] args) throws Exception {
        Country c = new Country("India", "Asia", 65);
        FileOutputStream fos = new FileOutputStream("country.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c);
        oos.flush();
        oos.close();
        System.out.println("success...");
        FileInputStream fis = new FileInputStream("country.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Country x = (Country) ois.readObject();
        x.print();
        ois.close();
    }
}