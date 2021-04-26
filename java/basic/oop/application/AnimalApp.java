package main.java.basic.oop.application;

import main.java.basic.oop.data.Animal;
import main.java.basic.oop.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.name = "Kelly";
        System.out.println(cat.name);
    }
}
