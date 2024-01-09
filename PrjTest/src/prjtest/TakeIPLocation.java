package prjtest;
import java.net.InetAddress;
public class TakeIPLocation {
      public static void main(String args[]) throws Exception
    {
        InetAddress myIP=InetAddress.getLocalHost();
        System.out.println("My IP location:");
        System.out.println(myIP.getHostAddress());
    }
}

