package ReviewClass10;

import com.syntax.class23.Car;

public abstract class AbstractCar {
    String make;
    String model;
    // we use constructor to initialize instance fields

    public AbstractCar(String make, String model) {
        this.make = make;
        this.model = model;
    }

    abstract void park(); // return type mast!
    void start() {
        System.out.println("Use keys to start me");
    }
}
class BMW extends AbstractCar {
    public BMW(String make, String model) {
        super(make, model);
    }

    @Override
    void park() {
        System.out.println("Use my auto parking mode to park me");
    }
}
