package Repls;
import java.util.*;
public class ConditionStatementScanner30 {
    //Write a program to take the month number from a user.
    //
    //Provide month name to the corresponding month number
    //
    //If a user provides any number that is out of month range, the program should display "Invalid"
    //
    //IMPORTANT: use Scanner Class

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter month number");
        int month = scanner.nextInt();
        if(month==1) {
            System.out.println("January");
        }else if(month==2){
            System.out.println("February");
        }else if(month==3){
            System.out.println("March");
        }else if(month==4){
            System.out.println("April");
        }else if(month==5){
            System.out.println("May");
        }else if(month==6){
            System.out.println("June");
        }else if(month==7){
            System.out.println("July");
        }else if(month==8){
            System.out.println("August");
        }else if(month==9){
            System.out.println("September");
        }else if(month==10){
            System.out.println("October");
        }else if(month==11){
            System.out.println("November");
        }else if(month==12){
            System.out.println("December");
        }else{
            System.out.println("Invalid");
        }
    }

}
