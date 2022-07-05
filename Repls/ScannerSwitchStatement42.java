package Repls;

import java.util.Scanner;

public class ScannerSwitchStatement42 {

        public static void main(String[] args) {
            System.out.println("Enter the roll number of the Child");
            Scanner scanner = new Scanner(System.in);
            int rollNumber = scanner.nextInt();
            String out;
            switch (rollNumber) {
                case 101:
                    out = "Student name: Ramesh";
                    break;
                case 102:
                    out = "Student name: Mahesh";
                    break;
                case 103:
                    out = "Student name: Mukesh";
                    break;
                default:
                    out = "Not found Student name: in Class";
            }
            System.out.println(out);
        }
    }
