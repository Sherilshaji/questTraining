package com.quest.fileHandling;

import java.io.File;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args)  {
        File fh = new File("FILE3.txt");
        try{
            System.out.println("Try Started");
            if(fh.exists()) {
                System.out.println("File exists");
                Scanner sc = new Scanner(fh);
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    System.out.println(line);
                }
                sc.close();
            }else{
                System.out.println("File not exists");
            }
            System.out.println("Try Stopped");
        }catch(Exception e){
            throw new RuntimeException(e);
        }finally {
            fh.delete();
            System.out.println("File deleted");
        }
    }
}
