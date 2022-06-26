package Repls;
import java.util.Scanner;
public class NestedIfScanner34 {
    //Write a program to find the largest number among three distinct numbers using nested if condition
    //
    //Please use Scanner class to take input from users

    public static void main(String[] args){
        Scanner result = new Scanner(System.in);

        int num1=4;
        int num2=5;
        int num3=14;

        System.out.println("Please enter 3 distinct numbers");
        num1 = result.nextInt();
        num2 = result.nextInt();
        num3 = result.nextInt();

        if (num1>=num2) {
            if(num1>=num3) {
                System.out.println("The largest number is "+num1);
            }else{
                System.out.println("The largest number is "+num3);
            }
        } else {
            if (num2>=num3) {
                System.out.println("The largest number is "+num2);
            }else {
                System.out.println("The largest number is "+num3);
            }
        }
    }

}
