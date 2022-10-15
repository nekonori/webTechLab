import java.util.*;
import java.io.*;
import java.net.*;

public class q1Server{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        try{
            ServerSocket ss=new ServerSocket(4000);
            Socket s=ss.accept();
            DataInputStream dis=new DataInputStream(s.getInputStream());
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            BufferedReader bis=new BufferedReader(new InputStreamReader(System.in));  
            String ipStr="",opStr="";
            while(!ipStr.equals("stop"))
            {
                ipStr=(String)dis.readUTF();
                System.out.println("Message from client\t-->"+ipStr);
                System.out.print(">>>");
                opStr=bis.readLine();
                dos.writeUTF(opStr);
                dos.flush();
            }
            dis.close();
            s.close();
            ss.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}