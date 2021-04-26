package main;

class Parent{
    String name;
    void doIt(){
        System.out.println("Do It main.Parent");
    }
}

class Child extends Parent{
    String name;
    void doIt(){
        System.out.println("Do It main.Child" + super.name);
    }
}