package main.java.basic.oop.application;

import main.java.basic.oop.data.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("IPhone 13", 30_000_000);
        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product);

        Product product1 = new Product("IPhone 13", 30_000_000);
        System.out.println(product1.equals(product1));
        System.out.println(product.hashCode() == product1.hashCode());

    }
}
