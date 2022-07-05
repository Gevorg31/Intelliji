package Repls;

import java.util.Scanner;

public class ScannerSwitchStatement44 {
    //Prompt user with questions: "Please enter your favorite car make"
    //if user enters BMW --> carOrigin = "german car"
    //if user enters Toyota --> carOrigin = " japanese car"
    //if user enters Maserati --> carOrigin = "italian car"
    //anything else besides those values --> carOrigin = "unknown"

    public static void main(String[] args) {
        System.out.println("Please enter your favorite car make");
        Scanner scanner=new Scanner(System.in);
        String carModel=scanner.next();
        String out;
        switch (carModel){
            case "BMW":
                out="Your favorite car is german car";
                break;
            case "Toyota":
                out="Your favorite car is japanese car";
                break;
            case "Maserati":
                out="Your favorite car is italian car";
                break;
            default:
                out="Your favorite car is unknown";
        }
    }
}
