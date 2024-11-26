package com.quest.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("FILE1.txt");
            System.out.println("File created successfully");
            int c;
            String str="Input as stream";
            FileOutputStream fos = new FileOutputStream("FILE1.txt");
            fos.write(str.getBytes());
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }
//            fis.read();
            fos.close();
            fis.close();
            System.out.println("\nFile stream is closed");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
