package Repls;
import java.util.Scanner;
public class LogicOperatorScanner39 {
    //A school has following rules for grading system: a. 1 to 25 - F b. 25 to 45 - E c. 45 to 50 - D d. 50 to 60 - C e. 60 to 80 - B f.
    // Above 80 - A Ask the user to enter marks and print the corresponding grade.

    public static void main(String[] args){
        Scanner grade = new Scanner(System.in);
        System.out.println("Please enter your marks");
        int result;
        result = grade.nextInt();
        if(result>=1 && result<=25){
            System.out.println("Your grade is F");
        }else if(result>=25 && result<=45){
            System.out.println("Your grade is E");
        }else if(result>=45 && result<=50){
            System.out.println("Your grade is D");
        }else if(result>=50 && result<=60){
            System.out.println("Your grade is C");
        }else if(result>=60 && result<=80){
            System.out.println("Your grade is B");
        }else if(result>80){
            System.out.println("Your grade is A");
        }else{
            System.out.println("Please enter valid mark");
            grade.close();
        }
    }
}
