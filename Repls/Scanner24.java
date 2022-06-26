package Repls;
import java.util.Scanner;
public class Scanner24 {
    //Write a program that takes a user's name and prints it.

    public static void main(String[] args){
        System.out.println("Hello, please print your name");
        Scanner input = new Scanner(System.in);
        System.out.println("Your name is "+input.next());
    }
}
