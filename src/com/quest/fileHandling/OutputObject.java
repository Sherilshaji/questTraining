package com.quest.fileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class OutputObject {
    public static void main(String[] args) {
        String str="Hello World";
        try{
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("FILE3.txt",true));
            bos.write(str.getBytes());
            System.out.println("Buffer data is added successfully");
            BufferedInputStream bis=new BufferedInputStream(new FileInputStream("FILE3.txt"));
            int c;
            while((c=bis.read())!=-1){
                System.out.print((char)c);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
