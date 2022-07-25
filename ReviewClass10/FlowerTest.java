package ReviewClass10;

public class FlowerTest {
    public static void main(String[] args) {
        Rose rose = new Rose("Red");
        rose.showColor();
        rose.bloom();
        rose.smell();
        rose.thorns();

        Flower flower = new Rose("Green");
        flower.bloom();
        flower.showColor();
        flower.smell();
        Rose rose1 = (Rose)flower; // converting back to rose
        rose1.thorns();

        Flower[] flowers = {new Rose("Red"), new Tulips("Pink")};
        for (Flower flower1: flowers) {
            flower1.bloom();
            flower1.smell();
            flower1.showColor();
        }
    }
}
