package Repls;
import java.util.Scanner;
public class Scanner22 {
    //Write a program to take user name, age and mobile number
    //
    //First Output: "Enter your name"
    //
    //Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
    //
    //Third Output: "Enter your age"

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = info.next();
        System.out.println("Enter your mobile number ");
        String phoneNumber = "123-456-7890";
        phoneNumber = info.next();
        System.out.println("Enter your age");
        int age = info.nextInt();
        System.out.println("Your name is "+name+","+" your age is "+age+" and your mobile number is "+phoneNumber);
    }
}
