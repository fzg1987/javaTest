package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TestWriter {
    public static void main(String[] args) {
        String fileName = "D:\\Work\\FileTest\\test2.txt";
        Writer writer = null;
        try {
            writer = new FileWriter(fileName);
            writer.write(20320);
            writer.write(22909);
            char[] chars = {'我','爱','世','界'};
            writer.write(chars,2,2);
            writer.write("我是方宗光",0,5);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
