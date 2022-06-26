package Repls;
import java.util.Scanner;
public class ConditionStatementScanner27 {
    //Write a Java program to ask age "Please enter your age".
    //
    //Based on the age define whether the user is eligible to vote or not.
    //
    //A person who is eligible to vote must be older or equal to 18 years old and the program will show "You are eligible to vote".
    //
    //Otherwise, the program will show "You are not eligible to vote".

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your age");
        int age = input.nextInt();
        if(age>16) {
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }
}
