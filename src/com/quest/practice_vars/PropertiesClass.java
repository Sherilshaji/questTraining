package com.quest.practice_vars;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("name","John Wick");
        prop.setProperty("age","25");
        try {
            prop.store(new FileWriter("props.properties"), null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileReader fr = new FileReader("props.properties");
            Properties props = new Properties();
            props.load(fr);
            System.out.println(props.getProperty("name"));
            System.out.println(props.getProperty("age"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
