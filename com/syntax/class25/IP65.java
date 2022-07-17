package com.syntax.class25;

public interface IP65 {
   // all static public final, we need to initialize all variables (no need to write static, public, final )
    String make = "LG"; // if we don't specify it with any access modifier in interface is treated as a public not default

    void wash();

}
interface FiveG{
    void speed();
}
interface FastChargeAble{
    void charging();
}

class S21Ultra implements IP65,FastChargeAble,FiveG{

    @Override
    public void wash() {
        System.out.println("You guys can wash me easily ezi pizi no issue");
    }

    @Override
    public void charging() {
        System.out.println("i support Fast charging now because i have implemented this requirement as well");
    }

    @Override
    public void speed() {
        System.out.println(" you can download things super fast because now i also support 5G");
    }

    public static void main(String[] args) {
        S21Ultra s21Ultra = new S21Ultra();
        s21Ultra.wash();
        s21Ultra.speed();
        s21Ultra.charging();
    }
}