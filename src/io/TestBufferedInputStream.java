package io;

import java.io.*;

public class TestBufferedInputStream {
    public static void main(String[] args) {
        String fileName = "D:\\Work\\FileTest\\test.txt";
        InputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            inputStream = new FileInputStream(fileName);
            bufferedInputStream = new BufferedInputStream(inputStream);
//            int temp = 0;
//            while ((temp = bufferedInputStream.read()) != -1) {
//                System.out.println(temp);
//            }
            byte[] bytes = new byte[20];
            System.out.println(bufferedInputStream.read(bytes));
            for (byte aByte : bytes) {
                System.out.println(aByte);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                inputStream.close();
                bufferedInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
