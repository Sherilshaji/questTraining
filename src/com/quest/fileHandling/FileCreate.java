package com.quest.fileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        File file=new File("FILE5.txt");
        try{
            if(file.createNewFile()){
                System.out.println("File created "+file.getName());
            }else{
                System.out.println("File already exist.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
