package main;

class Manager extends Employee{
    String company;

    Manager(String name, String company){
        super(name);
        this.company = company;
    }

    Manager(String name){
        super(name);
    }

    void sayHello(String name){
        System.out.println("Hello " + name + ", My Name is main.Manager " + this.name + this.company);
    }
}
class VicePresident extends Manager{
    VicePresident(String name){
        super(name);
    }

    void sayHello(String name){
        System.out.println("Hello " + name + ", My Name is Vice President " + this.name);
    }
}