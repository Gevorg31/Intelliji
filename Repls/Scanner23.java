package Repls;
import java.util.Scanner;
public class Scanner23 {
//Create a program that will ask a user to input boolean value "Input the boolean value"
//
//If the input is true or false, then the output should look like below:

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the boolean value");
        boolean result = scanner.nextBoolean();
        System.out.println("The value is "+result);
        scanner.close();
    }
}
