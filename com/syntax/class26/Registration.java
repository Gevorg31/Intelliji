package com.syntax.class26;

public class Registration {
    //Create Registration Class in which you would have variables as email,
    // userName and password that have an access scope only within its own class.
    // After creating an object of the class user should be able to call methods and in
    // each method separately pass values to set users email, username and password.
    //Requirements:
    //Valid email consider to be only yahoo
    //Valid userName and password cannot be empty and should be of length larger than 6 characters.
    // Also, valid password cannot contain userName.

    private String email;
    private String userName;
    private String password;

    public void callEmail(String email) {
        if (email.equals(email+"@yahoo.com")) {
            System.out.println("Correct yahoo email");
        } else {
            System.out.println("Please provide a yahoo email");
        }
    }
    public void callUserName(String userName) {
        if (userName.isEmpty() || userName.length() > 6) {
            System.out.println("Valid username");
        } else {
            System.out.println("Username is empty, less then 6 characters");
        }
    }
    public void callPassword(String password) {
        if (password.isEmpty() || password.length() > 6) {
            if (!password.equals(userName)) {
                System.out.println("Valid password and not contain username");
            }
        }
        else {
            System.out.println("Password is empty, less then 6 characters and contains username");
        }
    }
}
class FullInfo extends Registration {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.callEmail("Gevorg2022");
        registration.callUserName("Aladdin2222");
        registration.callPassword("Syntax2222");

    }
}
