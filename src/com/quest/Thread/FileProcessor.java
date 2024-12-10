package com.quest.Thread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
    public static void main(String[] args) {
        Thread t1=new Thread(new FileThread1());
        Thread t2=new Thread(new FileThread2());
        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class FileThread1 implements Runnable{

    @Override
    public void run() {
        try(BufferedReader reader=new BufferedReader(new FileReader("FILE4.txt"))){
            String data;
            while((data=reader.readLine())!=null){
                System.out.println("File 4: "+data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
class FileThread2 implements Runnable{
    @Override
    public void run() {
        try(BufferedReader reader=new BufferedReader(new FileReader("FILE5.txt"))){
            String data;
            while((data=reader.readLine())!=null){
                System.out.println("File 5: "+data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


