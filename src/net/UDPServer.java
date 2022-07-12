package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;

public class UDPServer {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        DatagramPacket datagramPacket = null;
        DatagramPacket datagramPacket2 = null;
        try {
            // 接收数据
            byte[] bytes = new byte[1024];
            datagramPacket = new DatagramPacket(bytes,bytes.length);
            datagramSocket = new DatagramSocket(8081);
            datagramSocket.receive(datagramPacket);
            String message = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
            System.out.println("我是TerminalA，接收到了" + datagramPacket.getPort() + "传输的数据：" + message);
            // 发送数据
            String reply = "我是TerminalA，已接收你发来的数据";
            SocketAddress socketAddress = datagramPacket.getSocketAddress();
            datagramPacket2 = new DatagramPacket(reply.getBytes(),reply.getBytes().length,socketAddress);
            datagramSocket.send(datagramPacket2);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            datagramSocket.close();
        }
    }
}
