package main;

public class Person {
    String Name;
    String Address;
    final String Country = "Indonesia";

    Person(String Name, String Address){
        this.Name = Name;
        this.Address = Address;
    }

    Person(String paramName){
        this(paramName, null);
    }

    Person(){
        this(null);
    }

    void SayHello(){
        this.SayHello("Bos");
    }
    public void SayHello(String paramName){
        System.out.println("Hello " + paramName + ", My Name Is " + this.Name);
    }
}
