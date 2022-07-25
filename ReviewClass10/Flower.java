package ReviewClass10;

public class Flower {
    String color;
    Flower(String color) {
        this.color=color;
    }
    void showColor() {
        System.out.println("Flowers have beautiful colors");
    }
    void smell() {
        System.out.println("Flowers smell very good");
    }

    void bloom() {
        System.out.println("Generally bloom in Spring");
    }


}
class Rose extends Flower{
    Rose(String color) {
        super(color);
    }

    void showColor() {
        System.out.println("Roses have "+color+" Colors");
    }

    void bloom() {
        System.out.println("Roses bloom in March");
    }
    void thorns() {
        System.out.println("Please be careful");
    }
}
class Tulips extends Flower{

    Tulips(String color) {
        super(color);
    }
    void showColor() {
        System.out.println("Tulips color "+color+" Color");
    }
}