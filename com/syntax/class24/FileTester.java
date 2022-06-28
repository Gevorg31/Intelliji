package com.syntax.class24;

public class FileTester {
    public static void main(String[] args) {
        File [] array = {new JavaFile(), new WordFile(), new PdfFile()};
        for (File arr:array) {
            arr.open();
            arr.edit();
            arr.close();
        }
    }
}
