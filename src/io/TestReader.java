package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestReader {
    public static void main(String[] args) {
        String fileName = "D:\\Work\\FileTest\\test.txt";
        Reader reader = null;
        try {
            reader = new FileReader(fileName);
            int temp = 0;
            char[] chars = new char[10];
            int read = reader.read(chars,2,5);
            System.out.println(read);
            for (char aChar : chars) {
                System.out.println(aChar);
            }
            while ((temp = reader.read()) != -1) {
                System.out.println(temp);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
