import java.util.*;
import java.io.*;
import java.net.*;

public class q1Client{
    public static void main(String[] args)
    {
        try{
            Socket s=new Socket("localhost",4000);
            DataInputStream dis=new DataInputStream(s.getInputStream());
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String ipStr="",opStr="";
            while(!ipStr.equals("stop"))
            {
                System.out.print(">>>");
                opStr=br.readLine();
                dos.writeUTF(opStr);
                dos.flush();
                ipStr=(String)dis.readUTF();
                System.out.println("Message from server-->"+ipStr);
            }
            dos.close();
            s.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}