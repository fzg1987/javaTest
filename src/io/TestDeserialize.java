package io;

import entity.User;

import java.io.*;

public class TestDeserialize {
    public static void main(String[] args) {
        String fileName = "D:\\Work\\FileTest\\test2.txt";
        InputStream inputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            inputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(inputStream);
            User user = (User) objectInputStream.readObject();
            System.out.println(user);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                inputStream.close();
                objectInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
