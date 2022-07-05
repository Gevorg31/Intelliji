package com.syntax.class25;

public class Human {
    final boolean canFlyWithoutAnyDevice; // final fields also can be initialized inside the constructor
    Human() {
        canFlyWithoutAnyDevice = false; // we can initialize it inside the constructor because it is executes first
    }
}
