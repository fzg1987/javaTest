package io;

import java.io.*;

public class TestBufferedWriter {
    public static void main(String[] args) {
        String fileName = "D:\\Work\\FileTest\\test2.txt";
        Writer writer = null;
        BufferedWriter bufferedWriter = null;
        try {
            writer = new FileWriter(fileName);
            bufferedWriter = new BufferedWriter(writer);
            String str = "阿斯利康的骄傲是考虑到撒即可";
            bufferedWriter.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.flush();
                writer.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
