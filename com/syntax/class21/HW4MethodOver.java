package com.syntax.class21;

public class HW4MethodOver {
    //Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.

    private static void carInfo(String make) {
        System.out.println("Car make is "+make);
    }

    private static void  carInfo(String make, String model) {
        System.out.println("Car make is "+make+" model  "+model);
    }

    private static void  carInfo(String make, String model, int year) {
        System.out.println("Car make is "+make+" model  "+" year "+year);
    }

    public static void main(String[] args) {
        HW4MethodOver methodOver = new HW4MethodOver();
        carInfo("Honda"); // directly
        HW4MethodOver.carInfo("Honda", "CRV"); // class
        methodOver.carInfo("Honda", "CRV", 2022); // object
    }

}
