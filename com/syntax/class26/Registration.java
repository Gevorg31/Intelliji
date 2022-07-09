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
        if (!email.contains("yahoo")) {
            System.out.println("Please use correct email yahoo.com");
        } else {
            this.email=email;
        }
    }
    public void callUserName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Invalid username, is empty");
        } else if (userName.length() <=6){
            System.out.println("Username  must be larger then 6 characters");
        }else {
            this.userName=userName;
        }
    }
    public void callPassword(String password) {
        if (password.contains(userName)) {
            System.out.println("password can't contain username");
        }else if(password.length()<=6){
            System.out.println("Password must be larger 6 characters");
        }else {
            this.password=password;
        }
    }
    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
class FullInfo extends Registration {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.callEmail("yahoo.com");
        System.out.println("Email : "+registration.getEmail());
        registration.callUserName("JavaBro");
        System.out.println("User name : "+registration.getUserName());
        registration.callPassword("Java2022");
        System.out.println("Password : "+registration.getPassword()); 
    }
}
