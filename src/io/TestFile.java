package io;

import java.io.File;

public class TestFile {
    public static void main(String[] args) {
        try{
            File file = new File("D:\\Work\\FileTest\\test.txt");
            if (file.exists()) {
                System.out.println(file.getName());
                System.out.println(file.length());
                System.out.println(file.getPath());
                System.out.println(file.getParent());
                File parentFile = file.getParentFile();
                System.out.println(parentFile.isDirectory());
                System.out.println(file.isDirectory());
                System.out.println(parentFile.isFile());
                System.out.println(file.isFile());
                File file1 = new File("D:\\Work\\FileTest\\test2.txt");
                boolean newFile1 = file1.createNewFile();
                if(newFile1){
                    System.out.println("文件创建成功");
                } else {
                    System.out.println("文件已存在");
                }
                File file2 = new File("D:\\Work\\FileTest\\newFile.txt");
                System.out.println(file1.renameTo(file2));
                System.out.println(file2.delete());
            } else {
                throw new Exception("文件不存在");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
