package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestOutputStream {
    public static void main(String[] args) {
        String fileName = "D:\\Work\\FileTest\\test2.txt";
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(fileName);
            byte[] bytes = {105,111,99};
            outputStream.write(bytes,0,3);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
