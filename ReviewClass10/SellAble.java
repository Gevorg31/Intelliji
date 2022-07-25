package ReviewClass10;

public interface SellAble {
    void sell();


}

interface ChargeAble extends SellAble {
    void charge();
}
class Laptop implements SellAble,ChargeAble {

    @Override
    public void sell() {
        System.out.println("You can sell me");
    }

    @Override
    public void charge() {
        System.out.println("You can charge me");
    }
}
