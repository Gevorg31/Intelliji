package Repls;
import java.util.Scanner;
public class ConditionStatementScanner28 {
    //Write a program to take values of length and width from the user.
    //
    //Based on value define whether the shape is a square or rectangle.

    public static void main(String[] args){
        Scanner value = new Scanner(System.in);
        int length;
        int width;
        System.out.println("Please enter the length");
        length = value.nextInt();
        System.out.println("Please enter the width");
        if(length>=18){
            width = value.nextInt();
            if(width>15){
            }  System.out.println("The shape of your object is rectangle");
        }else {
            System.out.println("The shape of your object is square");
        }
    }
}
