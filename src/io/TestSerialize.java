package io;

import entity.User;

import java.io.*;

public class TestSerialize {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        user.setAge(22);
        ObjectOutputStream objectOutputStream = null;
        String fileName = "D:\\Work\\FileTest\\test2.txt";
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(fileName);
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(user);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectOutputStream.flush();
                objectOutputStream.close();
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
