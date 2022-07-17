package com.syntax.class25;

public class Account {
    private String acc_no;
    private String name;
    private String email;
    private double amount;

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getAmount() {
        return amount;
    }

    public static void main(String[] args) {
        Account account = new Account();
         account.setAcc_no("7560504000");
         account.setName("Sumair");
         account.setEmail("sumair@syntax.com");
         account.setAmount(50000.0);

        System.out.println();
    }


}
