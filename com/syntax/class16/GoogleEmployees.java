package com.syntax.class16;

import java.sql.SQLOutput;

public class GoogleEmployees {

    String name; // type of variable instance
    double salary; // type of variable instance
    static int numberOfEmployees; // type of variable static
    static String companyName = "Google"; // type of variable static

    void displayEmployeeInfo() {
        System.out.println("Name "+name+" "+salary+ " Company Name "+companyName+" Total Employees "+numberOfEmployees);
    }

    public static void main(String[] args) {

        GoogleEmployees emp1 = new GoogleEmployees();
        emp1.name = "Oleg";
        emp1.salary = 250000;
        emp1.numberOfEmployees = 1;
        emp1.displayEmployeeInfo();

        GoogleEmployees emp2 = new GoogleEmployees();
        emp2.name = "Sameer";
        emp2.salary = 250001;
        emp2.numberOfEmployees = 2;
        emp2.displayEmployeeInfo();

    }

}
