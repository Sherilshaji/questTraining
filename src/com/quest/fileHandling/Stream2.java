package com.quest.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream2 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("FILE1.txt");
            System.out.println("File created successfully");
            int c;
            String str="Input as stream"+ "\nLine1"+ "\nLine2"+ "\nLine3";
            FileOutputStream fos = new FileOutputStream("FILE1.txt",true);
            fos.write(str.getBytes());
            fos.write("\nAdding line1".getBytes());
            fos.write("\nAdding line2".getBytes());
            fos.write("\nAdding line3".getBytes());
            fos.write("\nAdding line4".getBytes());
            fos.write("\nAdding line5".getBytes());
            while ((c = fis.read()) != -1){
                System.out.print((char)c);
            }
            fos.close();
            fis.close();
            System.out.println("\nFile read is closed");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
