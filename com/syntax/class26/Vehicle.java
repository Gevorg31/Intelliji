package com.syntax.class26;

public interface Vehicle {
    //Create a Class Vehicle that would have the following fields: vehiclePrice and method calculateSalePrice()
    // which should be returning a price of the Vehicle.
    //Create 2 subclasses: Sedan and Truck. The Truck class has field as weight and has its own implementation
    // of  calculateSalePrice() method in which returned price calculated as following: if weight>2000 then returned
    // price car should include 10% discount, otherwise 20% discount.
    //The Sedan class has field as length and also does its own implementation of calculateSalePrice():
    // if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
    double vehiclePrice = 0;

    void calculateSalePrice();

    class Truck implements Vehicle {
        double weight = 2500;

        public void calculateSalePrice(double vehiclePrice) {

            double returnedPrice;
            if (weight > 2000) {
                returnedPrice = (vehiclePrice * 10) / 100;
                System.out.println("The price of the truck includes a 10% discount " + returnedPrice);
            } else {
                returnedPrice = (vehiclePrice * 20) / 100;
                System.out.println("The price of the truck includes a 20% discount " + returnedPrice);
            }
        }

        @Override
        public void calculateSalePrice() {

        }
    }
    class Sedan implements Vehicle {
        int length = 25;

        public void calculateSalePrice(double vehiclePrice) {

            double returnedPrice;
            if (length > 20) {
                returnedPrice = (vehiclePrice * 5) / 100;
                System.out.println("The price of the Sedan includes a 5% discount " + returnedPrice);
            } else {
                returnedPrice = (vehiclePrice * 10) / 100;
                System.out.println("The price of the sedan includes a 10% discount " + returnedPrice);
            }
        }

        @Override
        public void calculateSalePrice() {

        }

        static class TestVehicle {
            public static void main(String[] args) {
                Sedan sedan = new Sedan();
                sedan.calculateSalePrice(40000);

                Truck truck = new Truck();
                truck.calculateSalePrice(125000);
            }
        }
    }
}




