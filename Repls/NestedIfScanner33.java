package Repls;
import java.util.Scanner;
public class NestedIfScanner33 {
    //For you to do:
    //
    //Ask the user to enter any number
    //
    //if a user enters a number and it is even, print "Value is even", otherwise print "Value is odd" and prints Odd value is just right
    //
    //If the number is even then check if it is greater than 1000 or not.
    //
    //If the number is greater than 1000, then print "Even value is large", else print "Even value is just right".

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scanner.nextInt();
        if(num%2==0){
            System.out.println("Value is even");
        }else{
            System.out.println("Value is odd");
            System.out.println("Odd value is just right");
        }
        if(num>1000){
            System.out.println("Even value is larger");
        }else{
            System.out.println("Even value is just right");
        }
    }
}
