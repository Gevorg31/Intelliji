package Repls;
import java.util.Scanner;
public class Scanner21 {
    // Write a program that asks the user's age: "Enter your age "
    //
    //Then display it by adding 10 (i.e age + 10) in your final output.
    public static void main(String[] args) {
        Scanner years = new Scanner(System.in);
        System.out.println("Enter your age");
        String age = years.nextLine();
        int a= 30;
        System.out.println("Your age after 10 years is "+(a+10));
    }
}
