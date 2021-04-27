package main.java.basic.oop.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Moch";
        first = first + " " + "Rofiq";
        System.out.println(first);

        String second = "Moch Rofiq";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Moch Rofiq";
        System.out.println(second == third);
        System.out.println(second.equals(third));

    }
}
