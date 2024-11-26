package com.quest.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandling2 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("FileWriter1.txt");
            fw.write("Hello World");
            fw.append("123456789",0,9);
            fw.close();
            System.out.println("File Created.");
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
