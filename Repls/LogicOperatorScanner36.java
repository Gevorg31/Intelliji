package Repls;
import java.util.Scanner;
public class LogicOperatorScanner36 {
    // Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"
    //
    //and make the comparisons:
    //
    //if int1 and int2 are equal and word1 and word2 are equal, output "AND"
    //if int1 and int2 are equal or word1 and word2 are equal, output "OR"
    //if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"

    public static void main(String [] args){

        Scanner prompt = new Scanner(System.in);
        System.out.println("Please enter two strings");
        String word1, word2 ;
        word1 = prompt.next();
        word2 = prompt.next();

        System.out.println("Please enter two numbers");
        int int1, int2 ;
        int1 = prompt.nextInt();
        int2 = prompt.nextInt();

        if(int1 == int2 && word1.equals(word2)) {
            System.out.println("AND");
        }else if(int1 == int2 || word1.equals(word2)) {
            System.out.println("OR");
        }else {
            System.out.println("NONE");
        }
        prompt.close();

    }
}
