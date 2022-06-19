package com.syntax.class19;

public class TeacherTester extends Teacher{
    public static void main(String[] args) {
    MathTeacher mathTeacher = new MathTeacher("Dasha","Female",25,178,"Math");
    mathTeacher.printInfo();
    ChemistryTeacher chemistryTeacher = new ChemistryTeacher("Sameer", "Male", 30,200,"Chemistry");
    chemistryTeacher.printInfo();
    PianoTeacher pianoTeacher = new PianoTeacher("Liana","Female",22,156,"Piano");
    pianoTeacher.printInfo();
    }
}
