package Repls;
import java.util.Scanner;
public class ConditionStatementScanner26 {
    //The variable "name" holds a String user input
    //
    //Write a conditional statement starting on line 9 that does the following:
    //
    //If name is equal to "Chen", print "teacher"
    //For any other input, print "student"

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String name = inp.nextLine();
        //DO NOT CHANGE ABOVE CODE!  Write your code below
        Scanner input = new Scanner(System.in);
        String a = "Chen";
        if (name.equals("Chen")) {
            System.out.println("teacher");
        }else{
            System.out.print("student");
        }
    }
}
