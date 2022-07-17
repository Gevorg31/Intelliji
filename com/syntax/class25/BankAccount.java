package com.syntax.class25;

public class BankAccount {
   private String name;
   private String username;
   private String password;
   private double Balance;
   private  int age;

    public void setName(String name) {
        String nameWithoutNumbers = name.replaceAll("[^A-Za-z]","");
        if(nameWithoutNumbers.equals(name)) {
            System.out.println("Number not present inside the name checking more rules");
            this.name=name;
        }else {
            System.out.println("Only alphabets are allowed");
        }
    }
    public void setUsername(String username) {
        if(username.length()>8 && username.length()<15) {
            System.out.println("Username accepted");
            this.username=username;
        }else {
            System.out.println("User names should be greater then 8 or less then 15");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
