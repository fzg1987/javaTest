package net;

import java.io.*;
import java.net.Socket;
import java.util.logging.SocketHandler;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream outputStream = null;
        InputStream inputStream = null;
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream = null;
        try {
            socket = new Socket("127.0.0.1",8080);
            System.out.println("----客户端----");
            String request = "你好";
            System.out.println("客户端说：" + request);
            outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF(request);
            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);
            String response = dataInputStream.readUTF();
            System.out.println("服务端响应为" + response);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            try {
                dataInputStream.close();
                dataOutputStream.close();
                inputStream.close();
                outputStream.close();
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
