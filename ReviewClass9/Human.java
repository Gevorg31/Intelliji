package ReviewClass9;

public class Human {
    String name;
    int age;
    double weight;
    String color;

    public Human(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
class Employee extends Human{
    String employeeID;
    double salary;
    String title;
    String department;

    public Employee(String name, int age, double weight, String color, String employeeID, double salary, String title, String department) {
        super(name, age, weight, color);
        this.employeeID = employeeID;
        this.salary = salary;
        this.title = title;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", salary=" + salary +
                ", title='" + title + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
class SDET extends Employee {
    String programmingLanguage;
    String framework;
    boolean knowsSelenium;

    public SDET(String name, int age, double weight, String color, String employeeID, double salary, String title, String department, String programmingLanguage, String framework, boolean knowsSelenium) {
        super(name, age, weight, color, employeeID, salary, title, department);
        this.programmingLanguage = programmingLanguage;
        this.framework = framework;
        this.knowsSelenium = knowsSelenium;
    }

    @Override
    public String toString() {
        return "SDET{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", framework='" + framework + '\'' +
                ", knowsSelenium=" + knowsSelenium +
                '}';
    }
}
class Developer extends Employee {

    public Developer(String name, int age, double weight, String color, String employeeID, double salary, String title, String department) {
        super(name, age, weight, color, employeeID, salary, title, department);
    }

}
