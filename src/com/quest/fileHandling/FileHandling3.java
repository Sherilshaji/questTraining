package com.quest.fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling3 {
    public static void main(String[] args) {
        File fh=new File("FILE4.txt");
        try{
            if(fh.createNewFile()||fh.exists()){
                System.out.println("File created");
                Scanner sc = new Scanner(fh);
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    System.out.println(line);
                }
            }else{
                System.out.println("File does not exist");
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            fh.delete();
            System.out.println("File deleted");
        }
    }
}
