package main.java.basic.oop.application;

import main.java.basic.oop.data.Bus;
import main.java.basic.oop.data.Car;
import main.java.basic.oop.data.Ferrari;

public class FerrariApp {
    public static void main(String[] args) {
        Car car = new Ferrari();
        car.isMaintenance();
        car.getBrand();
        car.drive();
        System.out.println(car.getTier());

        Bus bus = new Bus();
        bus.isBig();
        bus.isMaintenance();
        bus.getBrand();
        bus.drive();
        System.out.println(bus.getTier());
    }
}
