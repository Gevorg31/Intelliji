package com.syntax.class23;

public class Student {
    //Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    //Define common behavior within parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Write example of achieving run time

    public void writing () {

        System.out.println("Student is writing");
    }
    public void listening () {

        System.out.println("Student is listening");
    }

    public void reading () {

        System.out.println("Student is reading");
    }
}
class SyntaxStudent extends Student {
    @Override

    public void writing () {

        System.out.println("SyntaxStudent is writing");
    }
    public void listening () {

        System.out.println("SyntaxStudent is listening");
    }

    public void reading () {

        System.out.println("SyntaxStudent is reading");
    }
}
class CollegeStudent extends  SyntaxStudent {
    @Override

    public void writing () {
        System.out.println("CollegeStudent is writing");
    }
    public void listening () {
        System.out.println("CollegeStudent is listening");
    }

    public void reading () {

        System.out.println("CollegeStudent is reading");
    }
}

class SchoolStudent extends CollegeStudent {
    @Override

    public void writing () {

        System.out.println("SchoolStudent is writing");
    }
    public void listening () {

        System.out.println("SchoolStudent is listening");
    }

    public void reading () {

        System.out.println("SchoolStudent is reading");
    }
}

