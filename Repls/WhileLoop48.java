package Repls;

public class WhileLoop48 {
   // Using while loops that print out even numbers from 1 to 13

    public static void main(String[] args) {
        int i = 1;
        while (i <= 13) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
