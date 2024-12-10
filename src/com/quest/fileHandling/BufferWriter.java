package com.quest.fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
    public static void main(String[] args) {
        try(BufferedWriter writer=new BufferedWriter(new FileWriter("FILE5.txt",false))){
            writer.newLine();
            writer.write("Hello, World");
            writer.newLine();
            writer.write("This is a file handling example");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
