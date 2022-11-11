import java.util.*;
import java.io.*;
import java.net.*;

public class q1Server {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ServerSocket ss = new ServerSocket(4000);
        Socket s = ss.accept();
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String ipStr = "", opStr = "";
        while (!ipStr.equals("stop")) {
            ipStr = in.readLine();
            System.out.println("Message from client\t-->" + ipStr);
            System.out.print(">>>");
            opStr = sc.nextLine();
            out.println(opStr);
        }
        in.close();
        out.close();
        s.close();
        ss.close();
        sc.close();
    }
}
