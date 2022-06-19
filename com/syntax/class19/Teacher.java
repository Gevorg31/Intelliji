package com.syntax.class19;

import javax.xml.namespace.QName;

public class Teacher {
    //Write a Java program called Teacher.
    // Identify features and behaviour of that Class.
    // Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
    // that would have it their own features and behaviour. Test all 4 classes

    String firstName;
    String gender;
    int age;
    double weight;
    String teaching;

    void printInfo() {
        System.out.println("Full name "+firstName+" "+gender+" "+age+" years old "+" weight is "+weight+"Teaching "+teaching);
    }

    static class MathTeacher extends Teacher {
        MathTeacher(String firstName, String gender, int age, double weight, String teaching) {
            this.firstName=firstName;
            this.gender=gender;
            this.age=age;
            this.weight=weight;
            this.teaching=teaching;
        }

    }

  static   class ChemistryTeacher extends Teacher {
        ChemistryTeacher(String firstName, String gender, int age, double weight, String teaching) {
            this.firstName=firstName;
            this.gender=gender;
            this.age=age;
            this.weight=weight;
            this.teaching=teaching;
        }
    }

   static class PianoTeacher extends Teacher {
        PianoTeacher(String firstName, String gender, int age, double weight, String teaching) {
            this.firstName=firstName;
            this.gender=gender;
            this.age=age;
            this.weight=weight;
            this.teaching=teaching;
        }
    }

}
