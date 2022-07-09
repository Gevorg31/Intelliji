package com.syntax.class26;

 abstract class Marks {
    //We have to calculate the average of marks obtained in 3 subjects by student A and
    // in 4 subjects by student B. Create class 'Marks' with an abstract method 'getAverage'
    // that will be returning the average of marks. Provide implementation of abstract method in classes
    // 'A' and 'B'. The constructor of student A takes the marks in three subjects as its parameters and
    // the marks in four subjects as its parameters for student B. Test your code

     abstract double getAverage();

}
class A extends Marks {


     private  double subject1,subject2,subject3;

     public A(double subject1, double subject2, double subject3) {
         this.subject1=subject1;
         this.subject2=subject2;
         this.subject3=subject3;
     }

    @Override
    double getAverage() {
        return(subject1+subject2+subject3)/300.0*100;
    }
}
class B extends Marks {
    private double subject1, subject2,subject3,subject4;

    public  B(double subject1, double subject2, double subject3, double subject4) {
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
        this.subject4=subject4;
    }

    @Override
    double getAverage() {
        return (subject1+subject2+subject3+subject4)/400.0*100;
    }
}
class CountMarks {
   public static void main(String[] args) {
       A a = new A(55,77,99);
       B b = new B(33,54,88,77);

       double studentA = a.getAverage();
       double studentB = b.getAverage();

       System.out.println("Average of student A: "+studentA);
       System.out.println("Average of student B: "+studentB);
   }
}
