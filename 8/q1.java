/**
 *
 * @author kai
 */
import java.util.*;
import java.io.*;
import java.net.*;

public class q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        try{
            FileInputStream fis=new FileInputStream("inputfile.txt");
            FileOutputStream fos=new FileOutputStream("outputfile1.txt");
            
            int i=fis.read();
            String s="";
            while(i!=-1)
            {
                if((char)i=='\n') s+=" ";
                else s+=(char)i;
                i=fis.read();
            }
            fis.close();
            System.out.println(s);
            String[] arr=s.split(" ");
            Arrays.sort(arr);
            ArrayList<String> r=new ArrayList<String>();
            int t=0;
            for(String x:arr) System.out.println(x);
            for(i=0;i<arr.length;i++)
            {
                int c=1;
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i].equals(arr[j]))
                    {
                        c++;
                        arr[j]="0";
                    }
                }
                if(!arr[i].equals("0")){
                    String a="<--"+arr[i];
                    String b=String.valueOf(c);
                    String res=b+a+"\n";
                    r.add(res);
                    byte[] d=res.getBytes();
                    fos.write(d);
                }
            }
            Collections.sort(r,Collections.reverseOrder());
            for(String x:r){
                    byte[] e=(x.substring(4,x.length())).getBytes();
                    fos.write(e);
            }
            fos.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
