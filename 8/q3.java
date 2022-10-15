import java.util.*;
import java.io.*;
import java.net.*;

class Country implements Serializable{
    String conName;
    String contName;
    transient int population;
    Country(String con,String cont,int pop)
    {
        conName=con;
        contName=cont;
        population=pop;
    }
    void print()
    {
        System.out.println(conName+" "+contName+" "+population);
    }
}

public class q3{
    public static void main(String[] args)
    {
        try
        {
            Country c=new Country("India","Asia",65);
            FileOutputStream fos=new FileOutputStream("country.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(c);
            oos.flush();
            oos.close();
            System.out.println("success...");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try{
            FileInputStream fis=new FileInputStream("country.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Country x=(Country)ois.readObject();
            x.print();
            ois.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}