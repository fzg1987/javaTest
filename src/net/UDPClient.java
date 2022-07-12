package net;

import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        DatagramPacket datagramPacket = null;
        DatagramPacket datagramPacket2 = null;
        try {
            // 发送数据
            String message = "我是TerminalB，你好！";
            InetAddress inetAddress = InetAddress.getByName("localhost");
            datagramPacket = new DatagramPacket(message.getBytes(),message.getBytes().length,inetAddress,8081);
            datagramSocket = new DatagramSocket(8080);
            datagramSocket.send(datagramPacket);
            // 接收数据
            byte[] bytes = new byte[1024];
            datagramPacket2 = new DatagramPacket(bytes,bytes.length);
            datagramSocket.receive(datagramPacket2);
            String reply = new String(datagramPacket2.getData(),0,datagramPacket2.getLength());
            System.out.println("我是TerminalB，接收到了" + datagramPacket2.getPort() + "返回的数据：" + reply);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            datagramSocket.close();
        }

    }
}
