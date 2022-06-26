package com.syntax.class23;

public class Car {
    void start() {
        System.out.println("Use keys to start me");
    }

    void stop() {
        System.out.println("Use brake to stop me");
    }

    void park() {
        System.out.println("You can park me manually");
    }
}

class BMW extends Car {
    @Override
    void start() {
        super.start();
        System.out.println("You can use push start button to start me");
    }

    @Override
    void stop() {
        super.stop();
        System.out.println("You can use auto breaking or manual brakes to stop me");
    }

}

class Tesla extends Car {

    @Override
    void start() {
        super.start();
        System.out.println("You can use push start button to start me");
    }

    @Override
    void stop() {
        super.stop();
        System.out.println("You can use auto breaking or manual brakes to stop me");
    }

    @Override
    void park() {
        super.park();
        System.out.println("You can use auto parking to park me");
    }
}

class Toyota extends Car {

}


