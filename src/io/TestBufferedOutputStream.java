package io;

import java.io.*;

public class TestBufferedOutputStream {
    public static void main(String[] args) {
        String fileName = "D:\\Work\\FileTest\\test2.txt";
        OutputStream outputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            outputStream = new FileOutputStream(fileName);
            bufferedOutputStream = new BufferedOutputStream(outputStream);
            String str = "沙拉酱的客户数据卡里打几十块的";
            bufferedOutputStream.write(str.getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedOutputStream.flush();
                outputStream.close();
                bufferedOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
