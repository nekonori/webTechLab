import java.io.*;
import java.net.*;
import java.util.Scanner;

public class q1Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 4000);
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        Scanner sc = new Scanner(System.in);
        String ipStr = "", opStr = "";
        while (!ipStr.equals("stop")) {
            System.out.print(">>>");
            opStr = sc.nextLine();
            out.println(opStr);
            ipStr = in.readLine();
            System.out.println("Message from server-->" + ipStr);
        }
        s.close();
        sc.close();
        in.close();
        out.close();
    }
}