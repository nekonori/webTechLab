import java.net.*;
import java.util.*;

class q2Server{
    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(System.in);
            DatagramSocket dsserver=new DatagramSocket(5000);
            byte[] sendata=new byte[1024];
            byte[] recdata=new byte[1024];
            while(true){
                recdata=new byte[1024];
                DatagramPacket recpacket=new DatagramPacket(recdata,recdata.length);
                dsserver.receive(recpacket);
                String clismsg=new String(recpacket.getData());
                if(clismsg.equalsIgnoreCase("bye")){
                    break;
                }
                InetAddress ipaddr=recpacket.getAddress();
                int port=recpacket.getPort();
                String toupcase=clismsg.toUpperCase();
                System.out.println("Msg from client-->"+toupcase);
                System.out.print("Msg to Client-->");
                String cli=sc.nextLine();
                sendata=cli.getBytes();
                DatagramPacket sendpacket=new DatagramPacket(sendata,sendata.length,ipaddr,port);
                dsserver.send(sendpacket);
            }
            dsserver.close();
        }
        catch(Exception x){
            x.printStackTrace();
        }
    }
}