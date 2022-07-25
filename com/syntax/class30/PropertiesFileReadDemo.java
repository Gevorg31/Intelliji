package com.syntax.class30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReadDemo {
    public static void main(String[] args) throws IOException {
        // Get the path of a file
        String path = "Files/Abdul.Properties";
        // navigate to this location with the help of FileInputStream class if
        // we want to read the data or FileOutStream if we want to write the data
        FileInputStream fileInputStream = new FileInputStream(path);
        // Now we need a class that understands how to read the data from this file type
        Properties properties = new Properties();
        //loading the data from the file inside the properties Object
        properties.load(fileInputStream);

        System.out.println(properties.getProperty("user"));
        //we close this file to save system resources
        fileInputStream.close();
    }
}
