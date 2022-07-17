package com.syntax.class25;

public class Encapsulation {

    private String empName;
    private int empAge;

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }
    class Tester {
        public static void main(String[] args) {
            Encapsulation encapsulation = new Encapsulation();
           encapsulation.setEmpAge(30);
           encapsulation.setEmpName("Gevorg");
            encapsulation.getEmpAge();
            encapsulation.getEmpName();
            System.out.println();
        }
    }
}
