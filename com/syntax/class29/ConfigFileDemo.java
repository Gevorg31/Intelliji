package com.syntax.class29;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo {
    public static void main(String[] args) throws IOException {
        // How to read Properties file
        //Steps to read a file
        //1 we need to know the path/location of that file
        String path = "Files/Confirm.properties";

        //Navigate to that path where file is started
        FileInputStream fileInputStream = new FileInputStream(path); // exception like Thread.sleep()
        // we need to have a special software that understand that file that we can
        //use to open edit that file
        Properties properties = new Properties();
        //loading all the data from the file inside the properties objects
        properties.load(fileInputStream);

        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("url"));
        fileInputStream.close();

    }
}
