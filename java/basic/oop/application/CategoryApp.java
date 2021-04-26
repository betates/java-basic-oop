package main.java.basic.oop.application;

import main.java.basic.oop.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        Category category = new Category();
        category.setId("Id");
        category.setExpensive(true);

        System.out.println(category.getId());
        System.out.println(category.isExpensive());


    }
}
