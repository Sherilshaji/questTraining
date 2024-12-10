package com.quest.fileHandling;

import java.io.File;

public class FilePermissionExample {
    public static void main(String[] args) {
        File file=new File("FILE5.txt");

        if(file.setReadable(true)&&file.setWritable(true)){

            System.out.println("Permission set to read and write.");
        }else{
            System.out.println("Permission is not setted");
        }
    }
}
