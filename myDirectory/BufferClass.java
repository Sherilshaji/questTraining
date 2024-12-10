package com.quest.fileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferClass {
    public static void main(String[] args) {
        String str="Hello World";
        try{
            BufferedInputStream bis=new BufferedInputStream(new FileInputStream("FILE1.txt"));
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("FILE2.txt"));
            byte[] buffer=new byte[1024];
            int c;
            while((c=bis.read(buffer))!=-1){
                System.out.println((char)c);
                bos.write(buffer,0,(char)c);
            }
            bos.flush();
            bos.close();
            bis.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
