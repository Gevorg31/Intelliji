package com.syntax.class25;

public class Task1 {
    //Create a class File that will have the following behaviors:
    //open, edit, close. Edit and close are implemented method while open is an abstract.
    // Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    //  Example: to open .java file we need notepad++ or sublime text, to open .doc file
    //  we need Microsoft Word to be installed etc
    public static void main(String[] args) {

    // not possible to store the object of the class if they don't have extends relationship or same type
    File[] files = {new JavaFile(), new PDFFile(), new WordFile()};
    for(File file:files) {
        file.open();
        file.edit();
        file.close();
    }
}
}
abstract class File { // we cannot create an object of abstract class
    String name = "MSOfficeFile";
   abstract void open();
  // File(String name) {
     //  this.name = name;
  // }
   void edit() {
       System.out.println(name);
       System.out.println("Editing the file");
   }
   void close() {
       System.out.println("Closing the file");
   }
}
class JavaFile extends File {
   // JavaFile(String name) {
   //     super(name);
   // }
    void open() {
        System.out.println("Use Intellij to open Java files");
    }
    @Override
    void edit() {
        System.out.println("Editing the file with Intellij");
    }
}
class WordFile extends File {
  //  WordFile(String name) {
     //   super(name);
   // }
    @Override
    void open() {
        System.out.println("Use Microsoft Word to open word file");
    }
}
class PDFFile extends File {
   // PDFFile(String name) {
   //     super(name);
   // }
    @Override
    void open() {
        System.out.println("Use Adobe reader to open the pdf files");
    }
}