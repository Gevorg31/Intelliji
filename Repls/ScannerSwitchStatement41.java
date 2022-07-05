package Repls;

import java.util.Scanner;

public class ScannerSwitchStatement41 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age of the Child");
        int age=scanner.nextInt();
        String out;
        switch (age){
            case 1:
                out="You can Crawl";
                break;
            case 2:
                out="You can Talk";
            case 3:
                out="You can Dance";
            case 4:
                out="You can get  Trouble";
            default:
                out="I don't know how old you are";
        }
        System.out.println(out);
    }
}
