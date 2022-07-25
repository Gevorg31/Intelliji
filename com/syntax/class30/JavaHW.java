package com.syntax.class30;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaHW {
    //Create a property file to store following configurations:
    //browser=chrome
    //url=https://facebook.com
    //username
    //password
    //Read file and extract values of browser & url
    public static void main(String[] args) throws IOException {
        String path = "Files/Facebook.properties";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        Properties properties = new Properties();
        properties.setProperty("browser","chrome");
        properties.setProperty("url","https://facebook.com");
        properties.setProperty("username","JavaStudent");
        properties.setProperty("password","Batch14");
        properties.store(fileOutputStream,"Created a file for Facebook");
        System.out.println();
        System.out.println();
        fileOutputStream.close();
    }
}
