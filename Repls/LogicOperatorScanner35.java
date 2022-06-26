package Repls;
import java.util.Scanner;
public class LogicOperatorScanner35 {
    //Create a program that prompt user with question: "Do you need a loan?"(Use a boolean)
    //
    //If the result is true then prompt user with question: "What is your credit score?". Otherwise eligibility is "Unknown"
    //
    //Based on the score define users eligibility:
    //
    //if score is below 600 --> eligibility = "Not eligible"
    //if score is between 600 and 700 inclusive --> eligibility = "Maybe eligible"
    //if score is between 701 and 800 inclusive --> eligibility = "Eligible"
    //if score is higher than any other previous values --> eligibility = "Definitely eligible" .

    public static void main(String [] args){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean loan=prompt.nextBoolean();
        int creditScore;
        if(loan==true){
            System.out.println("What is your credit score?");
            creditScore=prompt.nextInt();
            if(creditScore<600){
                System.out.println("The eligibility is Not eligible");
            }else if(creditScore>=600 && creditScore<=700) {
                System.out.println("The eligibility is Maybe eligible");
            }else if(creditScore>=701 && creditScore<=800) {
                System.out.println("The eligibility is Eligible");
            }else if (creditScore>=800);
            System.out.println("The eligibility is Definitely eligible");
        } else {
            System.out.println("Unknown");
        }
    }
}
