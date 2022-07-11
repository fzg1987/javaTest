package io;

import java.io.*;

public class TestBufferedReader {
    public static void main(String[] args) {
        String fileName = "D:\\Work\\FileTest\\test.txt";
        Reader reader = null;
        BufferedReader bufferedReader = null;
        try{
            reader = new FileReader(fileName);
            bufferedReader = new BufferedReader(reader);
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
