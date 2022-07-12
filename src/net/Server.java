package net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        OutputStream outputStream = null;
        InputStream inputStream = null;
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream = null;
        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("----服务端----");
            System.out.println("已启动，等待接收客户端请求");
            while (true){
                socket = serverSocket.accept();
                inputStream = socket.getInputStream();
                dataInputStream = new DataInputStream(inputStream);
                String request = dataInputStream.readUTF();
                System.out.println("接收到了客户端请求：" + request);
                outputStream = socket.getOutputStream();
                dataOutputStream = new DataOutputStream(outputStream);
                String response = "Hello world!";
                dataOutputStream.writeUTF(response);
                System.out.println("给客户端做出响应：" + response);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            try {
                dataInputStream.close();
                dataOutputStream.close();
                inputStream.close();
                outputStream.close();
                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
