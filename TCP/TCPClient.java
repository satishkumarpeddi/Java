package TCP;

import java.io.*;
import java.net.*;
public class TCPClient {
    public static void main(String[] args)throws IOException{
        Socket socket = new Socket("localhost",5000);
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        out.writeUTF("Hello using TCP");
        out.flush();
        socket.close();
    }   
}
