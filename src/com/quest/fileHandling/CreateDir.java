package com.quest.fileHandling;

import java.io.File;

public class CreateDir {
    public static void main(String[] args) {
        File dir=new File("myDirectory");
//        boolean mkdir=file.mkdir();
//        if(mkdir){
//            System.out.println("Directory created: "+file.getName());
//        }else{
//            System.out.println("Directory not created");
//        }
        if(dir.exists()&& dir.isDirectory()){
            String[] files=dir.list();
            for (String file:files){
                File file1=new File("myDirectory/"+file);
                if(file1.isFile()){
                    System.out.println("File1: "+file1.getName());
                }
            }
        }else{
            System.out.println("Directory not found");
        }
    }
}
