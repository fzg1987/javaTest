package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestInputStream {
    public static void main(String[] args) {
        String fileName = "D:\\Work\\FileTest\\test.txt";
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(fileName);
            int temp = 0;
            while ((temp = inputStream.read()) != -1) {
                System.out.println(temp);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
