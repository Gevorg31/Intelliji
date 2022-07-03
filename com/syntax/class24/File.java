package com.syntax.class24;
//Create a class File that will have the following behaviors:
// open, edit, close. Edit and close are implemented method while open
// is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will
// provide specific implementation of open behaviour: Example: to open .java file
// we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc

 abstract  class File {

    abstract void open();

     void edit() {
         System.out.println("Edit File");
     }

     void close(){
         System.out.println("Close File");
     }
}

class JavaFile extends File {
    @Override
    void open() {
        System.out.println("To open .java file you have to install Eclipse or Intellij");
    }

}
class WordFile extends File {
    @Override
    void open() {
        System.out.println("To open .doc dile you have to have Microsoft Word ");
    }
}
class PdfFile extends File {
    @Override
    void open() {
        System.out.println("To open .pdf file please use Adobe");
    }

}
