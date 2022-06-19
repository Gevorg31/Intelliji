package com.syntax.class20;

public class SuperDemo {

    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.printColor();
    }
}

class Wood {
    String color = "blue";
}


class Furniture extends Wood {

    String color = "Black";
}

class Chair extends Furniture {
    String color = "Grey";
    void printColor() {
        String color = "White"; // always local variable are preferred
        System.out.println(super.color); //takes name from Furniture class "Black"
        System.out.println(this.color);
        System.out.println(color);
    }
}

