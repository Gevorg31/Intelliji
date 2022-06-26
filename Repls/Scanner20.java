package Repls;
import java.util.Scanner;
public class Scanner20 {
    //Write a program that takes user's first name and last name and prints in console
    //
    //Instruct the user to enter first name: "Please Enter First Name"
    //
    //Capture the first name
    //
    //Instruct the user to enter last name:"Please Enter Last Name"
    //
    //Capture last name
    //
    //Print first name and last name

    public static void main(String[] args){
        Scanner print = new Scanner(System.in);
        System.out.println("Please Enter First Name");
        String name = print.next();
        System.out.println("Please Enter Last Name");
        String lastName = print.next();
        System.out.println(name+" "+lastName);
    }
}
