package TCP;
import java.io.*;
import java.net.*;
public class TCPServer {
    public static void main(String[] args)throws Exception{
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("TCP Server started... Waiting for client");
        Socket socket = serverSocket.accept(); // Connection establishement
        DataInputStream in = new DataInputStream(socket.getInputStream());
        String message = in.readUTF();
        System.out.println("Received from client: "+message);
        socket.close();
        serverSocket.close();
    }
}
