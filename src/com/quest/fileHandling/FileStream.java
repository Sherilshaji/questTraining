package com.quest.fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStream {
    public static void main(String[] args) {
        try (FileInputStream fis=new FileInputStream("FILE5.txt")){
            FileOutputStream fos=new FileOutputStream("FILE4.txt");
            int byteData;
            while((byteData=fis.read())!=-1){
                fos.write(byteData);
            }
            System.out.println("File copied successfully using File Stream");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
