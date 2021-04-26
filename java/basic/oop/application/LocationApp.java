package main.java.basic.oop.application;

import main.java.basic.oop.data.City;

public class LocationApp {
    public static void main(String[] args) {
        City city = new City();
        city.name = "Surabaya";
        System.out.println(city.name);
    }
}
