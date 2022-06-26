package Repls;
import java.util.Scanner;
public class LogicOperatorScanner38 {
    //Prompt user with a question: "Is it weekend?"
    //
    //If it is not a weekend --> subject="manual testing"
    //
    //Otherwise --> subject="Java"

    static public void main(String[] args) {

        Scanner prompt = new Scanner(System.in);
        System.out.println("Is it weekend?");

        boolean answer=false;
        answer = prompt.nextBoolean();

        if(answer == false){
            System.out.println("Today you will be learning manual testing");
        }
        else {
            System.out.println("Today you will be learning Java");
        }
    }
}
